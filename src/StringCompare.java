import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String a = in.nextLine();
        System.out.print("Введите вторую строку: ");
        String b = in.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны.");
        } else {
            System.out.println("Строки неидентичны.");
        }
        in.close();
    }
}
