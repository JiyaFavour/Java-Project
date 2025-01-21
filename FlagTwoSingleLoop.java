public class FlagTwoSingleLoop {
    public static void main(String[] args) {
        String row1 = "* * * * = = = = = =\n=\n";
        String row2 = "= = = = = = = = = =\n";
        
        // Print the top part (repeated 3 times)
        for (int i = 0; i < 3; i++) {
            System.out.print(row1);
        }
        
        // Print the bottom part (repeated 2 times)
        for (int i = 0; i < 2; i++) {
            System.out.print(row2);
        }
    }
    
}
