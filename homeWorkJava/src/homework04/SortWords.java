package homework04;
import java.util.Arrays;
import java.util.Scanner;
//Задана строка, состоящая из букв английского алфавита,
//разделенных одним пробелом. Необходимо каждую последовательность
//символов упорядочить по возрастанию и вывести слова в нижнем регистре.

public class SortWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, состоящую из двух слов, разделенных пробелом:");
        String input = scanner.nextLine();

        // Разделяем строку на два слова
        String[] words = input.split(" ");

        if (words.length != 2) {
            System.out.println("Ошибка: Превышено количество слов");
            return;
        }

        // Преобразуем каждое слово в нижний регистр и сортируем по символам
        String sortedWord1 = sortWord(words[0].toLowerCase());
        String sortedWord2 = sortWord(words[1].toLowerCase());

        // Выводим результат
        System.out.println("Упорядоченные слова: " + sortedWord1 + " " + sortedWord2);
    }

    private static String sortWord(String word) {
        // Преобразуем слово в массив символов
        char[] chars = word.toCharArray();
        // Сортируем массив символов
        Arrays.sort(chars);
        // Преобразуем отсортированный массив обратно в строку
        return new String(chars);
    }

}
