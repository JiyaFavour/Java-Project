import java.util.Scanner;

public class TwoDArrayInputOutput {
    public static void main(String[] args) {
        // Declare a 2D array of size 10x10
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        // Using a nested loop to accept input from the user
        for (int i = 0; i < array.length; i++) { // Loop through rows
            for (int j = 0; j < array[i].length; j++) { // Loop through columns
                System.out.print("Enter a number for index (" + i + ", " + j + "): ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Using a nested for-each loop to print out the elements entered by the user
        System.out.println("The elements you entered are:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}