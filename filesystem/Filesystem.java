import java.util.Scanner;
import java.util.ArrayList;

public class Filesystem {
    static Directory currentWorkingDirectory;
    static ArrayList<Drive> drives = new ArrayList<Drive>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0];
            String path = parts[1];
            switch (command) {
                case "touch":
                    File file = new File(path);
                    currentWorkingDirectory.Add(file);
                case "mkdir":
                    Directory directory = new Directory(path);
                    currentWorkingDirectory.Add(directory);
                case "rm":
                    currentWorkingDirectory.Remove(path);
                case "ls":
                    currentWorkingDirectory.list();
                case "cd":
                    // cd
                case "pwd":
                    currentWorkingDirectory.printPath();
                case "help":

                case "exit":
            }
        }
    }
}