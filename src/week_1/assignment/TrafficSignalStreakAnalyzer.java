package week_1.assignment;

import java.util.Scanner;

public class TrafficSignalStreakAnalyzer {

    public static int findLongestGreenStreak(String[] signals) {

        int currentStreak = 0;
        int longestStreak = 0;

        for (String signal : signals) {

            if (signal.equalsIgnoreCase("Green")) {
                currentStreak++;

                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of signals: ");
        int n = scanner.nextInt();

        String[] signals = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter signal " + (i + 1) + ": ");
            signals[i] = scanner.next();
        }

        int longestStreak = findLongestGreenStreak(signals);

        System.out.println("Longest Green Streak: " + longestStreak);

        scanner.close();
    }
}