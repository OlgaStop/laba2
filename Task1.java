package Project1;
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        // Оператор % возвращает остаток от деления
        if (num % 3 == 0) {
            System.out.println("Число " + num + " делится на 3.");
        } else {
            System.out.println("Число " + num + " НЕ делится на 3.");
        }
        in.close();
		

	}

}
