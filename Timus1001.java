package Project1;
import java.util.Scanner;
import java.util.ArrayList;
public class Timus1001 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList<>();

        // Считываем все числа до конца файла
        while (in.hasNextLong()) {
            numbers.add(in.nextLong());
        }

        // Выводим корни в ОБРАТНОМ порядке (с конца списка)
        for (int i = numbers.size() - 1; i >= 0; i--) {
            // Math.sqrt возвращает double. 
            // printf("%.4f") выведет ровно 4 знака после запятой
            System.out.printf("%.4f\n", Math.sqrt(numbers.get(i)));
        }
        
        in.close();
    }
}
