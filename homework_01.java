package homework;

public class homework_01 {
   public static void main(String[] args) {
    int n = 10; 
        int num = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            num += i;
            factorial *= i;
        }
        System.out.println("n-ое треугольное число: " + num);
        System.out.println("n! (факториал): " + factorial);
   } 
}
