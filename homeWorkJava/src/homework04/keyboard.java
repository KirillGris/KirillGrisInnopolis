package homework04;
import java.util.HashMap;
import java.util.Scanner;
//Для введенной с клавиатуры буквы английского алфавита нужно вывести слева стоящую букву на стандартной клавиатуре. При этом клавиатура замкнута, т.е. справа от буквы «p» стоит буква «a», а слева от "а" буква "р", также соседними считаются буквы «l» и буква «z», а буква «m» с буквой «q».
//Входные данные: строка входного потока содержит один символ — маленькую букву английского алфавита.
//Выходные данные: следует вывести букву стоящую слева от заданной буквы, с учетом замкнутости клавиатуры.
public class keyboard {
    public static void main(String[] args) {
        HashMap<Character, Character> ABCmap = new HashMap<>();
        ABCmap.put('a', 'p');
        ABCmap.put('b', 'v');
        ABCmap.put('c', 'x');
        ABCmap.put('d', 's');
        ABCmap.put('e', 'w');
        ABCmap.put('f', 'd');
        ABCmap.put('g', 'f');
        ABCmap.put('h', 'g');
        ABCmap.put('i', 'u');
        ABCmap.put('j', 'h');
        ABCmap.put('k', 'j');
        ABCmap.put('l', 'k');
        ABCmap.put('m', 'q');
        ABCmap.put('n', 'b');
        ABCmap.put('o', 'i');
        ABCmap.put('p', 'a');
        ABCmap.put('q', 'm');
        ABCmap.put('r', 'e');
        ABCmap.put('s', 'a');
        ABCmap.put('t', 'r');
        ABCmap.put('u', 'y');
        ABCmap.put('v', 'c');
        ABCmap.put('w', 'q');
        ABCmap.put('x', 'z');
        ABCmap.put('y', 't');
        ABCmap.put('z', 'l');

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите букву анг алфавита: ");
        char inputChar = scanner.next().charAt(0);

        if (ABCmap.containsKey(inputChar)) { // Проверяем, есть ли введенный символ в мапе
            char leftChar = ABCmap.get(inputChar); // Получаем значение, соответствующее введенному символу
            System.out.println("Слева от " + inputChar + " находится " + leftChar); // Выводим результат
        } else {
            System.out.println("Ошибка: введена не маленькая буква английского алфавита."); // Выводим сообщение об ошибке
        }

    }

}
