
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        ArrayList<Game> gamesList = readFromFile(fileName);

        System.out.println("Team:");
        String teamInput = scan.nextLine();

        ArrayList<Game> games = new ArrayList<>();
        for (Game game: gamesList) {
            if (teamInput.equals(game.getHomeTeam()) || teamInput.equals(game.getAwayTeam())) {
                games.add(game);
            }
        }



    }

    public static ArrayList<Game> readFromFile(String fileName) {
        ArrayList<Game> games = new ArrayList<>();

        try (Scanner read = new Scanner(Paths.get(fileName))){
            while (read.hasNextLine()) {
                String line = read.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
                games.add(new Game(homeTeam, awayTeam, homePoints, awayPoints));
            }
        } catch (Exception e) {
            System.out.println("Error, retry.");
        }

        return games;

    }
}
