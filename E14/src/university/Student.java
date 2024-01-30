package university;

import student.StudentRecord;

import java.util.Arrays;
import java.util.Collection;

public record Student(String name, double avarageGrade, int yearOfStudy) implements Comparable<Student>
{
    public Student(String name, double avarageGrade, int yearOfStudy) {
        this.name = name;
        this.avarageGrade = avarageGrade;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public int compareTo(Student o) {
        int wynik = Double.compare(o.avarageGrade, this.avarageGrade);

        if(wynik == 0)
        {
            return Integer.compare(o.yearOfStudy, this.yearOfStudy);
        }
        else
        {
            return wynik;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
          new Student("Kamil", 2.1, 3),
          new Student("Dawid", 4.5, 2),
          new Student("Basia", 3.7, 2),
          new Student("Dominika", 5.0, 1),
        };

        System.out.println("Przed sortowaniem\n");

        for(Student student : students)
        {
            System.out.println(student);
        }

        System.out.println("\nPo sortowaniu\n");

        Arrays.sort(students);

        for(Student student : students)
        {
            System.out.println(student);
        }
    }

}
