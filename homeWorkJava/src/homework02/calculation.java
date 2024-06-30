package homework02;
import java.util.Scanner;
//Напишите программу на Java, которая принимает два целых числа от пользователя,
// а затем печатает сумму, разницу, произведение, среднее значение, расстояние (разница между целыми числами),
// максимум (большее из двух целых чисел), минимум (меньшее из двух целых чисел).
public class calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите данные: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        int diff = x - y;
        int multipl = x * y;
        int avv = (x + y)/2;
        int diff2 = Math.abs(x - y);
        int max = Math.max(x, y);
        int min = Math.min(x, y);

        System.out.println("Сумма: " + sum);
        System.out.println("Разница : " + diff);
        System.out.println("Произведение : " + multipl);
        System.out.println("Среднее значение : " + avv);
        System.out.println("Расстояние : " + diff2);
        System.out.println("Максимум : " + max);
        System.out.println("Минимум : " + min);



    }

}
