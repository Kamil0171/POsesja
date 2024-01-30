package university;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(2, "Kamil", 3.2));
        students.add(new Student(1, "Adam", 4.0));
        students.add(new Student(6, "Tadzio", 2.1));
        students.add(new Student(8, "Basia", 6.0));
        students.add(new Student(6, "Dominika", 3.75));

        for(Student student : students)
        {
            System.out.println(student);
        }

        System.out.println();
        System.out.println();

        Collections.sort(students, new IdComparator().thenComparing(new AverageGradeComparator()));

        for(Student student : students)
        {
            System.out.println(student);
        }

        System.out.println();

        Collections.sort(students, new IdComparator());

        for(Student student : students)
        {
            System.out.println(student);
        }


    }
}
