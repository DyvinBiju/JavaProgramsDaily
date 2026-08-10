import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class FileCaseFlip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Path filePath;

        // 1, 2, 3. Accept filename and check whether it exists
        while (true) {
            System.out.print("Enter the name of the text file: ");
            String fileName = sc.nextLine();

            filePath = Paths.get(fileName);

            if (Files.exists(filePath) && Files.isRegularFile(filePath)) {
                System.out.println("File found successfully.");
                break;
            } else {
                System.out.println("File does not exist. Please enter another file name.");
            }
        }

        // 4. Read and display the first five lines
        System.out.println("\nFirst five lines of the original file:");

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {

            String line;
            int count = 0;

            while ((line = reader.readLine()) != null && count < 5) {
                System.out.println(line);
                count++;
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        // 5 and 6. Flip case and save using a temporary file
        Path tempFile = null;

        try {
            // Create a temporary file in the same directory
            Path parent = filePath.getParent();

            if (parent == null) {
                parent = Paths.get(".");
            }

            tempFile = Files.createTempFile(parent, "temp_", ".txt");

            // Read original file and write modified content to temporary file
            try (BufferedReader reader = Files.newBufferedReader(filePath);
                 BufferedWriter writer = Files.newBufferedWriter(tempFile)) {

                int ch;

                while ((ch = reader.read()) != -1) {

                    char c = (char) ch;

                    // Convert uppercase to lowercase
                    if (Character.isUpperCase(c)) {
                        c = Character.toLowerCase(c);
                    }
                    // Convert lowercase to uppercase
                    else if (Character.isLowerCase(c)) {
                        c = Character.toUpperCase(c);
                    }

                    writer.write(c);
                }
            }

            // Replace original file with the temporary file
            Files.move(
                    tempFile,
                    filePath,
                    StandardCopyOption.REPLACE_EXISTING
            );

            System.out.println("\nFile case flipped successfully.");

        } catch (IOException e) {
            System.out.println("Error modifying the file: " + e.getMessage());
        }

        // 7. Read and display the first five lines of updated file
        System.out.println("\nFirst five lines of the updated file:");

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {

            String line;
            int count = 0;

            while ((line = reader.readLine()) != null && count < 5) {
                System.out.println(line);
                count++;
            }

        } catch (IOException e) {
            System.out.println("Error reading the updated file: " + e.getMessage());
        }

        sc.close();
    }
}