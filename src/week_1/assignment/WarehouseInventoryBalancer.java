package week_1.assignment;

import java.util.Scanner;

public class WarehouseInventoryBalancer {

    public static int findTotalInventory(int[] inventory) {
        int total = 0;

        for (int quantity : inventory) {
            total += quantity;
        }

        return total;
    }

    public static int findAverageInventory(int[] inventory) {
        int total = findTotalInventory(inventory);
        return total / inventory.length;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of warehouses: ");
        int n = scanner.nextInt();

        int[] inventory = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter inventory for warehouse " + (i + 1) + ": ");
            inventory[i] = scanner.nextInt();
        }

        int total = findTotalInventory(inventory);
        int average = findAverageInventory(inventory);

        System.out.println("\nTotal Inventory: " + total);
        System.out.println("Average Inventory: " + average);

        System.out.println("\nWarehouses needing restocking:");

        boolean needsRestocking = false;

        for (int i = 0; i < n; i++) {
            if (inventory[i] < average) {
                System.out.println("Warehouse " + (i + 1)
                        + " - Inventory: " + inventory[i]);
                needsRestocking = true;
            }
        }

        if (!needsRestocking) {
            System.out.println("None");
        }

        scanner.close();
    }
}