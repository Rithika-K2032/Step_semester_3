package week_3.assignment;

public class ExamHall {
    static class Hall {
        String hallName;
        int seatsFilled;
    }

    public static void main(String[] args) {
        Hall hallA = new Hall();
        Hall hallB = new Hall();

        hallA.hallName = "Block-3 Hall A";
        hallB.hallName = "Block-3 Hall B";

        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;

        System.out.println(hallA.hallName + " seatsFilled: " + hallA.seatsFilled);
        System.out.println(hallB.hallName + " seatsFilled: " + hallB.seatsFilled);
    }
}