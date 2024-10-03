import java.util.Arrays;
class Statistics {
    public static double findAverage(int[] array) {
        try {
            if (array == null || array.length == 0) {
                System.out.println("Array is empty or null. Cannot compute average.");
                return Double.NaN; }
            double sum = 0;
            for (int num : array) {
                sum += num; }
            return sum / array.length; } catch (Exception e) {

            System.out.println("An error occurred while computing the average.");
            return Double.NaN; }
    } }