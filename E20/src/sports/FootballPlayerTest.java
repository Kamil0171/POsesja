package sports;

public class FootballPlayerTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        FootballPlayer orginalPlayer = new FootballPlayer("Kamil", new int[]{3,7,1,7,0});

        FootballPlayer clonedPlayer = (FootballPlayer) orginalPlayer.clone();

        orginalPlayer.changeIndex(4, 10);

        System.out.println(orginalPlayer);
        System.out.println(clonedPlayer);
    }
}
