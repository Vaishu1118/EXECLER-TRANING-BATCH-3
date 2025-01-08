public class Bowler {

    // Instance variables
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    // Default constructor
    public Bowler() {
        this.name = "Unknown";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    // Parameterized constructor
    public Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    // Method to compute and print bowling average
    public void computeBowlingAverage() {
        if (isValidInput()) {
            if (wickets > 0) {
                double bowlingAverage = (double) runsConceded / wickets;
                System.out.println("Name: " + name);
                System.out.printf("bowling_avg=%.1f\n", bowlingAverage);
            } else {
                System.out.println("Error: Wickets cannot be zero for calculating bowling average.");
            }
        }
    }

    // Method to compute and print strike rate
    public void computeStrikeRate() {
        if (isValidInput()) {
            if (ballsBowled > 0) {
                double strikeRate = (double) runsConceded / ballsBowled;
                System.out.println("Name: " + name);
                System.out.printf("Strike_rate=%.8f\n", strikeRate);
            } else {
                System.out.println("Error: Balls bowled cannot be zero for calculating strike rate.");
            }
        }
    }

    // Method to show statistics
    public void showStatistics() {
        if (isValidInput()) {
            System.out.println("Name=" + name);
            System.out.println("wickets=" + wickets);
            System.out.println("matches=" + matches);
            System.out.println("balls_bowled=" + ballsBowled);
            System.out.println("runs_conceded=" + runsConceded);
        }
    }

    // Helper method to validate input
    private boolean isValidInput() {
        if (wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0) {
            System.out.println("Error");
            return false;
        }
        if ((runsConceded > 0 || ballsBowled > 0) && matches == 0) {
            System.out.println("Error");
            return false;
        }
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a bowler using the parameterized constructor
        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);

        // Calling methods to test functionality
        bowler.showStatistics();
        bowler.computeBowlingAverage();
        bowler.computeStrikeRate();
    }
}

