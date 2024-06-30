package homework04;
import java.util.Scanner;
//поиск значений (">>-->" или "<--<<" ) в передаваемой строке
public class ArrowCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, состоящую из символов '>', '<' и '-': (максимум 106 символов)");
        String sequence = scanner.nextLine();

        if (sequence.length() > 106) {
            System.out.println("Ошибка: введенная строка превышает допустимую длину в 106 символов.");
        } else {
            int arrowCount = countArrows(sequence);
            System.out.println("Количество спрятанных стрел: " + arrowCount);
        }
    }

    public static int countArrows(String sequence) {
        int count = 0;
        String arrow1 = ">>-->";
        String arrow2 = "<--<<";

        for (int i = 0; i <= sequence.length() - arrow1.length(); i++) {
            if (sequence.substring(i, i + arrow1.length()).equals(arrow1) ||
                    sequence.substring(i, i + arrow2.length()).equals(arrow2)) {
                count++;
            }
        }

        return count;
    }

}
