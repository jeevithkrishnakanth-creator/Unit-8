public class Entry {
    String name;
    Directory parentDirectory;
    boolean directory;

    Entry(String name) {
        this.name = name;
    }

    String getPath() {
        if (parentDirectory != null) {
            return parentDirectory.getPath() + "/" + name;
        } else {
            return name;
        }
    }

    void printPath() {
        System.out.println(getPath());
    }
}