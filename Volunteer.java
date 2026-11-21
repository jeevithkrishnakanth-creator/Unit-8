public class Volunteer {
    public static void main(String[] args) {
        String[] volunteers = new String[8];
        volunteers[0] = "Robert";
        volunteers[1] = "Penelope";
        volunteers[1] = "Penny";
        for (String volunteer : volunteers) {
            if (volunteer == null) {
                volunteer = "Student";
            }
            System.out.println(volunteer);
        }
    }
}
