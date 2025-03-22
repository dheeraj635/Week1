
import java.util.Scanner;

public class Rock_paper {
   public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);
   	System.out.print("Enter the number of games: ");
   	int games = scanner.nextInt();
   	int userWins = 0, computerWins = 0;

   	for (int i = 0; i < games; i++) {
       	System.out.print("Enter your choice (rock, paper, scissors): ");
       	String userChoice = scanner.next().toLowerCase();
       	String computerChoice = getComputerChoice();
       	String winner = findWinner(userChoice, computerChoice);

       	if (winner.equals("User")) userWins++;
       	else if (winner.equals("Computer")) computerWins++;

       	System.out.println("Game " + (i + 1) + ": User chose " + userChoice + ", Computer chose " + computerChoice + ". Winner: " + winner);
   	}

   	String[][] stats = calculateStats(userWins, computerWins, games);
   	displayResults(stats);
   }

   public static String getComputerChoice() {
   	String[] choices = {"rock", "paper", "scissors"};
   	return choices[(int) (Math.random() * 3)];
   }

   public static String findWinner(String userChoice, String computerChoice) {
   	if (userChoice.equals(computerChoice)) return "Draw";
   	if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
       	(userChoice.equals("scissors") && computerChoice.equals("paper")) ||
       	(userChoice.equals("paper") && computerChoice.equals("rock"))) {
       	return "User";
   	}
   	return "Computer";
   }

   public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
   	double userWinPercentage = (userWins / (double) totalGames) * 100;
   	double computerWinPercentage = (computerWins / (double) totalGames) * 100;
   	return new String[][]{
       	{"Player Wins", String.valueOf(userWins)},
       	{"Computer Wins", String.valueOf(computerWins)},
       	{"Player Win %", String.format("%.2f", userWinPercentage)},
       	{"Computer Win %", String.format("%.2f", computerWinPercentage)}
   	};
   }

   public static void displayResults(String[][] stats) {
   	System.out.println("\nGame Stats:");
   	for (String[] stat : stats) {
       	System.out.printf("%-15s: %s%n", stat[0], stat[1]);
   	}
   }
}

