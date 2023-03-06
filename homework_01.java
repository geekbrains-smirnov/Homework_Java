package homework;

import java.util.Scanner;

public class homework_01 {
    public static void main(String[] args) {
        System.out.println("Задача №1: Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)");
        System.out.println();
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum_n = 0;
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            sum_n += i;
            factorial *= i;
        }
        System.out.println("Сумма чисел от 1 до n, где n = " + n + " равняется: " + sum_n);
        System.out.println("Произведение чисел от 1 до n, где n = " + n + " равняется: " + factorial);
    }
}
