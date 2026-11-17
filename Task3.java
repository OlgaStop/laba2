package Project1;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        // && означает логическое "И" (оба условия должны быть верны)
        if (num % 4 == 0 && num >= 10) {
            System.out.println("Число удовлетворяет условиям.");
        } else {
            System.out.println("Число НЕ удовлетворяет условиям.");
        }
        in.close();

	}

}
