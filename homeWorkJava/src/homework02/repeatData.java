package homework02;
import java.util.Scanner;
//Напишите Java-программу для объединения данной строки с самим собой заданное количество раз. Тестовые данные:
// Исходная строка: Java Сколько раз вывести строку? 8 Ожидаемый результат : После повторения 8 раз: JavaJavaJavaJavaJavaJavaJavaJava
public class repeatData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число повторений: ");
        int a = scanner.nextInt();
        String Jv = "Java";
        int start = 1;
        int end = a;

        for (int i = start; i <= end; i++) {
            //System.out.println(Jv);
            System.out.print(Jv);
        }
        System.exit(0);
    }

}
