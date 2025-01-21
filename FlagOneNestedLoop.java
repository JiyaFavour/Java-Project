public class FlagOneNestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) { // Outer loop for rows
            for (int j = 0; j < 12; j++) { // Inner loop for columns
                if (j < 4 || j >= 8) { // Stars section
                    System.out.print("* ");
                } else { // Equals section
                    System.out.print("= ");
                }
            }
            System.out.println(); // New line after each row
        }
    }
}