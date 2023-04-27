package Task;

import java.util.Collections;
import java.util.LinkedList;

public class Task06 {
    public static void ReversedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.print("Создали список LinkedList(list): ");
        System.out.println(list);
        LinkedList<Integer> RevList = new LinkedList<>(list);
        Collections.reverse(RevList);
        System.out.print("Далее мы его перевернули: ");
        System.out.println(RevList);
//        Данный метод реализует перевернутый список
        LinkedList<Integer> EnqueueList = new LinkedList<>(RevList);
        EnqueueList.addLast(1);
        System.out.print("Помещаем элемент '1' в конец очереди: ");
        System.out.println(EnqueueList);
        System.out.print("Возвращаем первый элемент из очереди не удаляя его: ");
        System.out.println(EnqueueList.peek());
        System.out.println(EnqueueList);
        System.out.print("Возвращаем первый элемент из очереди удаляя его: ");
        System.out.println(EnqueueList.poll());
        System.out.println(EnqueueList);


    }
}
