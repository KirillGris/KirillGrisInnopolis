package homework02;
import java.util.Scanner;
//Задача 4*. Напишите программу на Java для печати сетки из заданных элементов.
//Тестовые данные: Введите число строк и столбцов сетки: 10
//Введите повторяемый элемент сетки: -
//Ожидаемый результат :
// Сетка по запросу 10 на 10
public class printNet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк и столбцов сетки: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите элемент сетки: ");
        var Jv = scanner.nextLine() + ' ';
        int start = 1;
        int end = a;

        for (int i = start; i <= end; i++) {
            for (int s = 1; s <= a; s++) {
                System.out.print(Jv);
            }
            System.out.println();
        }

        System.exit(0);
    }

}
