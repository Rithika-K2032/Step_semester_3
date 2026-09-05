package week_3.class_problems;

public class HostelRoom {
    static class Room {
        String roomNo;
        int occupied;
    }

    public static void main(String[] args) {
        Room roomA = new Room();
        Room roomB = new Room();

        roomA.roomNo = "C-101";
        roomB.roomNo = "C-102";

        roomA.occupied++;
        roomA.occupied++;
        roomA.occupied++;

        System.out.println(roomA.roomNo + " occupied: " + roomA.occupied);
        System.out.println(roomB.roomNo + " occupied: " + roomB.occupied);
    }
}