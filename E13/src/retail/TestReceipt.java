package retail;

import java.util.ArrayList;

public class TestReceipt {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(1.1);
        lista.add(2.1);
        lista.add(23.1);
        lista.add(112.1);
        lista.add(42.1);

        Receit orginalReceit = new Receit("1", lista);
        Receit clonedReceipt = (Receit) orginalReceit.clone();
        orginalReceit.changeIndex(0, 12.0);

        System.out.println(orginalReceit);
        System.out.println(clonedReceipt);
    }
}
