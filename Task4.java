package Project1;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        if (num >= 5 && num <= 10) {
            System.out.println("Число попадает в диапазон от 5 до 10.");
        } else {
            System.out.println("Число НЕ попадает в диапазон.");
        }
        in.close();

	}

}
