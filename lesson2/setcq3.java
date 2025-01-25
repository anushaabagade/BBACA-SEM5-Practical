import java.util.Scanner;

class CricketPlayer {
    private int pid;
    private String pname;
    private int totalRuns;
    private int inningsPlayed;
    private int notOutTimes;

    public CricketPlayer(int pid, String pname, int totalRuns, int inningsPlayed, int notOutTimes) {
        this.pid = pid;
        this.pname = pname;
        this.totalRuns = totalRuns;
        this.inningsPlayed = inningsPlayed;
        this.notOutTimes = notOutTimes;
    }

    public double calculateAverage() {
        return (double) totalRuns / inningsPlayed;
    }

    public void displayDetails() {
        System.out.println("Player ID: " + pid);
        System.out.println("Player Name: " + pname);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Innings Played: " + inningsPlayed);
        System.out.println("Not Out Times: " + notOutTimes);
        System.out.println("Average Runs per Innings: " + calculateAverage());
    }

    public double getAverage() {
        return calculateAverage();
    }
}

public class setcq3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cricket players: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        CricketPlayer[] players = new CricketPlayer[n];
        double maxAverage = -1;
        CricketPlayer bestPlayer = null;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Player " + (i + 1) + ":");

            System.out.print("Player ID: ");
            int pid = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Player Name: ");
            String pname = scanner.nextLine();

            System.out.print("Total Runs: ");
            int totalRuns = scanner.nextInt();

            System.out.print("Innings Played: ");
            int inningsPlayed = scanner.nextInt();

            System.out.print("Not Out Times: ");
            int notOutTimes = scanner.nextInt();
            scanner.nextLine();

            players[i] = new CricketPlayer(pid, pname, totalRuns, inningsPlayed, notOutTimes);

            double average = players[i].getAverage();
            if (average > maxAverage) {
                maxAverage = average;
                bestPlayer = players[i];
            }
        }

        System.out.println("\nPlayer with the highest average:");
        if (bestPlayer != null) {
            bestPlayer.displayDetails();
        } else {
            System.out.println("No player data available.");
        }

        scanner.close();
    }
}
