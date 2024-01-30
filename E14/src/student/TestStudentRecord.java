package student;

public class TestStudentRecord
{
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord("Kamil", "012", 4.0);
        StudentRecord student2 = new StudentRecord("Paulina", "0711", 2.0);

        student1.printDetails();
        System.out.println(student1.isHonorStudent());

        System.out.println();

        student2.printDetails();
        System.out.println(student2.isHonorStudent());

    }
}
