public class FlagTwoNestedLoop {
    public static void main(String[] args) {
        // Top part: 3 groups of stars and equals with a newline
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (j < 4) { // Print stars
                    System.out.print("* ");
                } else { // Print equals
                    System.out.print("= ");
                }
            }
            System.out.println("\n="); // Move to next line and print '='
        }

        // Bottom part: 2 rows of equals
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("= ");
            }
            System.out.println(); // Move to next line
        }
    }

    
}
