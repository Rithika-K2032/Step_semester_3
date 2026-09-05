package week_3.class_problems;

public class LibraryCard {
    static class Card {
        String holderName;
        int booksIssued;
        boolean active;
    }

    public static void main(String[] args) {
        Card card = new Card();

        System.out.println("Holder: " + card.holderName);
        System.out.println("Books Issued: " + card.booksIssued);
        System.out.println("Active: " + card.active);
    }
}