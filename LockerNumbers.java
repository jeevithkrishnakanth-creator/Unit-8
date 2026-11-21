import java.util.HashMap;

public class LockerNumbers {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        students.put(11, "George");
        students.put(5, "Anna");
        students.put(43, "Harper");
        students.remove(11);
        System.out.println("Number of lockers: " + students.size());
        students.put(17, "Mark");
        System.out.println("Locker 11: " + students.get(11));
        for (int number : students.keySet()) {
            if (students.get(number) == "Anna") {
                System.out.println("Anna's locker number: " + number);
            }
        }
        students.clear();
    }
}
