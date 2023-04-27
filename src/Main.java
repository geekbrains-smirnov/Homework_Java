import Task.Task07;

import java.io.IOException;
import java.util.Set;

import static Task.Task01.BubbleSort;
import static Task.Task01.write;
import static Task.Task02.parseString;
import static Task.Task04.result;
import static Task.Task05.MinMax;
import static Task.Task06.ReversedList;
import static Task.Task07.*;

public class Main {
    public static void main(String[] args)  {
//        System.out.println(BubbleSort()); // Задача 1
//        write(); // Задача 1
//        parseString();
//        result();
//        MinMax();
//        ReversedList();
        Task07 phoneBook = new Task07();
        phoneBook.addContact("Иванов", "8888888");
        Set<String> numbers = phoneBook.getPhoneNumbers("Иванов");
        System.out.println(numbers);


    }
}