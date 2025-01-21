
    import java.util.Arrays;
public class ArrayStats {
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
        int n = arr.length;

        // Mean
        double sum = 0;
        for (int num : arr) sum += num;
        double mean = sum / n;
        System.out.println("Mean: " + mean);

        // Median
        Arrays.sort(arr);
        double median = (n % 2 == 0) ? (arr[n / 2 - 1] + arr[n / 2]) / 2.0 : arr[n / 2];
        System.out.println("Median: " + median);

        // Standard Deviation
        double variance = 0;
        for (int num : arr) variance += Math.pow(num - mean, 2);
        double stdDev = Math.sqrt(variance / n);
        System.out.println("Standard Deviation: " + stdDev);
    }
}
    

