
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        String found = "";
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                if (reader.nextLine().equals(searchedFor)) {
                    System.out.println("Found!");
                    found = "yes";
                    break;
                }

            }
            if (!found.equals("yes")) {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }


    }
}
