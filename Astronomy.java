import java.util.HashSet;

public class Astronomy {
    public static void main(String[] args) {
        HashSet<String> constellations = new HashSet<String>();
        constellations.add("Leo Minor");
        constellations.add("Lynx");
        constellations.add("Cepheus");
        constellations.add("Usra Minor");
        constellations.remove("Cepheus");
        constellations.add("Lacerta");
        constellations.add("Camelopardalis");
        constellations.add("Lynx");
        System.out.println(constellations.size());
        System.out.println(constellations.contains("Cassiopeia"));
        constellations.add("Cassiopeia");
        System.out.println(constellations);
    }
}
