package tourism;

public class TestHotel
{
    public static void main(String[] args) {
        try
        {
            Hotel hotel = new Hotel("Martio", 12.2);
            Hotel hotel2 = new Hotel("Maasdajsd", -40);
            Hotel podroba = (Hotel) hotel.clone();
            Hotel podroba2 = (Hotel) hotel2.clone();

            System.out.println(hotel);
            System.out.println(podroba);

            System.out.println(hotel2);
            System.out.println(podroba2);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
