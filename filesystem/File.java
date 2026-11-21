public class File extends Entry {
    String data;

    File(String name, String data) {
        super(name);
        this.data = data;
        directory = false;
    }

    File(String name) {
        super(name);
    }

    void Read() {
        System.out.println(data);
    }

    void Write(String data) {
        this.data = data;
    }

    void Append(String data) {
        this.data += (" " + data);
    }
}
