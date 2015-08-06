
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                // Print the top ten players sorted by points.
                System.out.println("Top ten by points");
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                // Print the top ten players sorted by goals.
                System.out.println("Top ten by goals");
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
                System.out.println("");
            } else if (command.equals("assists")) {
                //  Print the top ten players sorted by assists.
                System.out.println("Top ten by assists");
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
                System.out.println("");
            } else if (command.equals("penalties")) {
                //  Print the top ten players sorted by penalties.
                System.out.println("Top 10 playes based on penalty amount");
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
                System.out.println("");
            } else if (command.equals("player")) {
                // Ask the user first which player's statistics are needed and then print them.
                System.out.println("Enter the name of the player");
                String playerName = reader.nextLine();
                System.out.println("Player statistics");
                System.out.println("Statistics for " + playerName);
                NHLStatistics.searchByPlayer(playerName);
                System.out.println("");
            } else if (command.equals("club")) {
                // Ask the user first which club's statistics are needed and then print them.
                // Note: When printing statistics they should be ordered by points (so the players with the most points come first).
                System.out.println("Enter the name of the club");
                String clubName = reader.nextLine();
                System.out.println("Clubs statistics");
                System.out.println("Statistics for " + clubName);
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(clubName);
                System.out.println("");
            }

        }
    }
}
