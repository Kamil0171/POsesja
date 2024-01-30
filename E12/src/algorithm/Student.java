package algorithm;

import java.util.Objects;

public class Student
{
    public String name;
    public float grade;

    public Student(String name, float grade)
    {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Float.compare(grade, student.grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    public static <T> boolean compareThree(T first, T second, T third)
    {
        if(first.equals(second) && second.equals(third))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Kamil", 2);
        Student student2 = new Student("Tadzio", 2);
        Student student3 = new Student("Dawid", 1);

        boolean wynik = compareThree(student1, student2, student3);
        System.out.println(wynik);
    }
}
