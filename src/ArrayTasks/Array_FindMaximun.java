package ArrayTasks;
import java.util.*;
public class Array_FindMaximun { /*
        Write a function that can find the maximum number from an int Array
     */


    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }
}
