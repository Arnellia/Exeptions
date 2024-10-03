import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        int[] array;
        if (args.length > 0) {
            array = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        } else {
            array = new int[]{10, 20, 30, 40, 50};
        }
        double average = Statistics.findAverage(array);
        System.out.println(average);
    }
