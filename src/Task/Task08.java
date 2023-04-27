package Task;


import java.util.*;

public class Task08 {





        public static void main(String[] args) {
            String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                    "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Иван Иванов",
                    "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                    "Иван Иванов", "Мария Рыкова", "Анна Крутова", "Марина Лугова", "Анна Владимирова",
                    "Петр Лыков", "Иван Мечников", "Петр Петин", "Петр Лыков", "Иван Ежов"};

            // Создание HashMap для хранения имен и количества повторений
            Map<String, Integer> nameCountMap = new HashMap<>();

            // Подсчет количества повторений имен
            for (String employee : employees) {
                if (nameCountMap.containsKey(employee)) {
                    int count = nameCountMap.get(employee);
                    nameCountMap.put(employee, count + 1);
                } else {
                    nameCountMap.put(employee, 1);
                }
            }

            // Преобразование HashMap в список, чтобы отсортировать по убыванию популярности
            List<Map.Entry<String, Integer>> nameCountList = new ArrayList<>(nameCountMap.entrySet());

            // Сортировка списка по убыванию популярности
            nameCountList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

            // Вывод результатов
            for (Map.Entry<String, Integer> entry : nameCountList) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + ": " + entry.getValue() + " повторений");
                }
            }
        }
    }



