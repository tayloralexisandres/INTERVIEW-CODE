package ArrayTasks;
import java.util.*;
public class Array_FindMinimun {
    /*
    Write a function that can find the maximum number from an int Array
     */

    public static int maxValue(int[] n) {

        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }

        return min;

    }
}
