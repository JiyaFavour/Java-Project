import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        // Declare an array of length 10
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        // a. Using a loop to accept input from the user
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number for index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // b. Using a for-each loop to print out the input entered by the user
        System.out.println("The elements you entered are:");
        for (int num : array) {
            System.out.println(num);
        }

        scanner.close();
    }
}