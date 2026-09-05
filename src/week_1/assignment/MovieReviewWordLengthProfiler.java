package week_1.assignment;

import java.util.Scanner;

public class MovieReviewWordLengthProfiler {

    public static void analyzeReview(String review) {

        String[] words = review.trim().split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        for (String word : words) {

            // Remove punctuation
            word = word.replaceAll("[^a-zA-Z]", "");

            int length = word.length();

            if (length <= 3) {
                shortWords++;
            } else if (length <= 6) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println("\n===== Movie Review Word Length Profile =====");
        System.out.println("Short words (1-3 letters): " + shortWords);
        System.out.println("Medium words (4-6 letters): " + mediumWords);
        System.out.println("Long words (7+ letters): " + longWords);
        System.out.println("Total words: " + words.length);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your movie review: ");
        String review = scanner.nextLine();

        analyzeReview(review);

        scanner.close();
    }
}