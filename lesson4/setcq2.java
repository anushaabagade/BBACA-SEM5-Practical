import java.io.File;

public class setcq2 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java SimpleFileLister <directory-path>");
            return;
        }

        File directory = new File(args[0]);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".txt")) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.out.println("Error reading directory.");
            }
        } else {
            System.out.println("Not a directory.");
        }
    }
}
