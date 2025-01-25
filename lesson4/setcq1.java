import java.io.File;

public class setcq1 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide file names as command-line arguments.");
            return;
        }

        for (String fileName : args) {
            File file = new File(fileName);

            if (file.exists()) {
                if (fileName.endsWith(".txt")) {
                    if (file.delete()) {
                        System.out.println("Deleted: " + file.getName());
                    } else {
                        System.out.println("Failed to delete: " + file.getName());
                    }
                } else {
                    System.out.println("File Name: " + file.getName());
                    System.out.println("File Location: " + file.getAbsolutePath());
                    System.out.println("File Size: " + file.length() + " bytes");
                    System.out.println();
                }
            } else {
                System.out.println("File does not exist: " + fileName);
            }
        }
    }
}
