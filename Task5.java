package Project1;
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        // Например, в числе 123456: 
        // 123456 / 1000 = 123 (отбрасываем остаток) 
        // 123 % 10 = 3 (берем последнюю цифру)
        int thousands = (num / 1000) % 10;

        System.out.println("Количество тысяч (4-я цифра справа): " + thousands);
        in.close();

	}

}
