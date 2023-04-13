package Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task04 {

    public static void result(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            Integer number = iterator.next();
            if(number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);

    }

}
