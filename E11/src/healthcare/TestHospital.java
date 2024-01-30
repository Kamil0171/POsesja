package healthcare;

public class TestHospital
{
    public static void main(String[] args)
    {
        Hospital hospital1 = new Hospital("Glowny szpital", 200);
        Hospital hospital2 = new Hospital("Miejski szpital", -50);
        Hospital hospital3 = new Hospital(null, 150);

        Clinic clinic1 = new Clinic("Eloelo320", 30, 4.5);
        Clinic clinic2 = new Clinic("Siemaelobenc", 40, 6.0);

        System.out.println(hospital1);
        System.out.println(hospital2);
        System.out.println(hospital3);

        System.out.println();

        System.out.println(clinic1);
        System.out.println(clinic2);
    }
}