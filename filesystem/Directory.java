import java.util.HashSet;

public class Directory extends Entry {
    HashSet<Entry> entries = new HashSet<Entry>();

    Directory(String name) {
        super(name);
        directory = true;
    }

    void Add(Entry entry) {
        entries.add(entry);
    }

    void Remove(String name) {
        entries.remove(get(name));
    }

    Entry get(String name) {
        for (Entry entry : entries) {
            if (entry.name == name) {
                return entry;
            }
        }
        Entry invalid = new Entry("invalid");
        return invalid;
    }

    void list() {
        for (Entry entry : entries) {
            if (entry.directory == true) {
                System.out.print(entry.name + "/");
            } else {
                System.out.print(entry.name);
            }
        }
    }
}
