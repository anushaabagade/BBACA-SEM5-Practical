import java.io.File;

public class setaq3 {

    public static void main(String[] args) {
        String filePath = "path_to_your_file";
        File file = new File(filePath);
        if (file.exists()) {
            long fileSizeInBytes = file.length();
            System.out.println("File Size: " + fileSizeInBytes + " bytes");

            double fileSizeInKB = (double) fileSizeInBytes / 1024;
            System.out.printf("File Size: %.2f KB%n", fileSizeInKB);

            double fileSizeInMB = fileSizeInKB / 1024;
            System.out.printf("File Size: %.2f MB%n", fileSizeInMB);
        } else {
            System.out.println("File not found.");
        }
    }
}
