package university;

import java.util.Iterator;
import java.util.List;

class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}

class University {
    public static <T> int countElements(Iterator<T> items, T element) {
        int count = 0;
        while (items.hasNext()) {
            T currentElement = items.next();
            if (currentElement != null && currentElement.equals(element))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("John", 75.5),
                new Student("Alice", 82.0),
                new Student("Bob", 90.5),
                new Student("Alice", 82.0)
        );

        Student targetStudent = new Student("Alice", 82.0);

        int occurrences = countElements(studentList.iterator(), targetStudent);

        System.out.println("Number of occurrences of " + targetStudent.getName() + " with grade " + targetStudent.getGrade() + ": " + occurrences);
    }
}