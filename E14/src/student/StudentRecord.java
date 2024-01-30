package student;

public record StudentRecord(String name, String id, double gpa)
{
    public StudentRecord{
        if(gpa < 0.0 || gpa > 4.0)
        {
            throw new IllegalArgumentException("Srednia ocen powinna byc w zakresie od 0.0 do 4.0");
        }
    }

    public boolean isHonorStudent()
    {
        if(gpa >= 3.5) {
            return true;
        }
        else{
            return false;
        }
    }

    public void printDetails()
    {
        System.out.println("Imie: " + name);
        System.out.println("Identyfikator: " + id);
        System.out.println("Srednia ocen: " + gpa);
    }

}
