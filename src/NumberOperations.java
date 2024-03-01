import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число a: ");
        int a = in.nextInt();
        System.out.print("Введите целое число b: ");
        int b = in.nextInt();

        if (a < b) {
            System.out.println("a < b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление: на 0 делить нельзя!");
        }
        System.out.println("Умножение: " + (a * b));

        in.close();
    }
}
