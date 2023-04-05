/* 1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл (через FileWriter). */

package Task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task01 {
    public static String BubbleSort()  {
        System.out.println("Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.(через FileWriter).");
        int [] arr = {3,5,2,0,9,9,7};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        String arrStr = String.join(", ", Arrays.toString(arr));
        return arrStr;






    }
    public static void write(){
        try (FileWriter in = new FileWriter("test.txt", true)){
            String result = BubbleSort();
            in.append(result);
            System.out.println("Recorded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
