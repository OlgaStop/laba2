package Project1;
import java.util.Scanner;
public class Timus1293 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        
        // Площадь одной панели
        long area = (long) a * b;
        // Общая площадь всех панелей, обработанных с ДВУХ сторон
        long totalArea = n * area * 2;
        
        // Выводим результат (1 нанограмм на 1 кв. метр)
        System.out.println(totalArea);
        
        in.close();
    }

}
