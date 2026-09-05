package week_1.class_problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    // Method to determine the result of one round
    public static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove)) {
            return "Draw";
        }

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }

        return "Computer Wins";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0;
        int losses = 0;
        int draws = 0;

        int rounds = 5;

        System.out.println("=== Rock-Paper-Scissors Game ===");

        for (int i = 1; i <= rounds; i++) {

            // Player input
            System.out.print("\nRound " + i + " - Enter Rock, Paper, or Scissors: ");
            String playerMove = scanner.nextLine();

            // Computer randomly selects a move
            String computerMove = moves[random.nextInt(3)];

            // Determine result
            String result = playRound(playerMove, computerMove);

            System.out.println("Player Move   : " + playerMove);
            System.out.println("Computer Move : " + computerMove);
            System.out.println("Result        : " + result);

            // Update scoreboard
            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        // Calculate player's win percentage
        double winPercentage = (wins * 100.0) / rounds;

        System.out.println("\n========== FINAL SCOREBOARD ==========");
        System.out.println("Total Wins   : " + wins);
        System.out.println("Total Losses : " + losses);
        System.out.println("Total Draws  : " + draws);
        System.out.printf("Win Percentage: %.2f%%\n", winPercentage);

        scanner.close();
    }
}