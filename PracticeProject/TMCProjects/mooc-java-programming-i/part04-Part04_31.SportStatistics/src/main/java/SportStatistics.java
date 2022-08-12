
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("File:");
        try (Scanner fileReader = new Scanner(Paths.get(scan.nextLine()))) {
            System.out.println("Team:");
            String inputTeam = scan.nextLine();
            int gameCount = 0;
            int wins = 0;
            int losses = 0;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
                if (inputTeam.equals(homeTeam)) {
                    gameCount++;
                    if (homePoints > awayPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (inputTeam.equals(awayTeam)) {
                    gameCount++;
                    if (homePoints > awayPoints) {
                        losses++;
                    } else {
                        wins++;
                    }
                }

            }
            System.out.println("Games: " + gameCount);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Error, file not found.");
        }
    }

}
