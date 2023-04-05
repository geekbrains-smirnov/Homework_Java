//2. Дана строка json:
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.

package Task;

import java.util.Arrays;

public class Task02 {
    public static void parseString() {
        String str = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        StringBuilder outputStringBuilder = new StringBuilder();
        String[] students = str.replaceAll("[\\[\\]]", "").split("\\},\\s*\\{");
        for (String student : students) {
            String[] parts = student.split(",\\s*");
            String surname = parts[0].split(":\\s*\"")[1].replaceAll("\"", "");
            String mark = parts[1].split(":\\s*\"")[1].replaceAll("\"", "");
            String subject = parts[2].split(":\\s*\"")[1].replaceAll("\"", "");
            outputStringBuilder.append("Студент ")
                    .append(surname)
                    .append(" получил ")
                    .append(mark)
                    .append(" по предмету ")
                    .append(subject)
                    .append(".\n");
        }
        System.out.println(outputStringBuilder.toString());
    }

}
