import java.util.ArrayList;

public class VendingMachine {
    public static void main(String[] args) {
        ArrayList<String> snacks = new ArrayList<String>();
        snacks.add("Goldfish");
        snacks.add("Fritos");
        snacks.add("Skittles");
        snacks.add("Snickers");
        snacks.add("Chex Mix");
        for (String snack : snacks) {
            System.out.println(snack);
        }
        snacks.remove(3);
        snacks.set(2, "Doritos");
        for (String snack : snacks) {
            System.out.print(snack + " ");
        }
        System.out.println();
        System.out.println("Stock: " + snacks.size());
        snacks.clear();
        for (String snack : snacks) {
            System.out.println(snack);
        }
        System.out.println("Snacks: " + snacks);
    }
}
