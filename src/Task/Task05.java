package Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Task05 {
    public static void MinMax(){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 7, 4));
        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
            if (list.get(i) > max) {
                max = list.get(i);
            }
            sum += list.get(i);
        }

        double average = (double)sum / list.size();

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }
}
