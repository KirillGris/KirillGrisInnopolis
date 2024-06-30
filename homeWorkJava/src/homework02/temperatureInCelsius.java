package homework02;
import java.util.Scanner;
//Java-программа для преобразования температуры из Фаренгейта в градусы Цельсия
public class temperatureInCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите температуру в Фаренгейтах: ");
        double number = (sc.nextDouble() -32) * 5 / 9;
        // Изначально: sc.nextDouble() *100/212 (но у температ, как оказалось, есть странная формула расчета)
        String NumberС = String.format("%.2f", number);

        System.out.println("Температура в Цельсиях: " + NumberС);


    }

}
