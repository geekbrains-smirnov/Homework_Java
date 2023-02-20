package homework;

import java.util.Scanner;

public class homework_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Введите текс который нужно преобразовать: ");
        String input = scanner.nextLine();
        String output = text(input);
        System.out.print(output);
        }
    public static String text(String input) {
        // String result = "([А-ЯA-Z])";
        String output = input.replaceAll("\\s{1,}([А-ЯA-Z])", ".$0") + ".";
        return output;
            
    }
        

}

