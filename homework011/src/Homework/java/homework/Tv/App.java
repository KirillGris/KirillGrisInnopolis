package Homework.java.homework.Tv;
import java.util.Scanner;


    public class App {
        public static void main(String[] args) {
            Tv tv1 = new Tv(); //пользователь выбирает канал
            tv1.turnOn();
            Scanner sc = new Scanner(System.in);
            System.out.println("введите номер телеканала: ");
            int channelNumber = sc.nextInt();
            tv1.setChannel(channelNumber);
            System.out.println("Tv1 включен:" + tv1.isTvWork());
            System.out.println("Текущий канал Tv1: " + tv1.getChannel());
            System.out.println(); //добавлено для визуального разделения результатов выполнения кода

            Tv tv2 = new Tv(); //включаем телевизор и устанавливаем рандомное значение канала
            tv2.turnOn();
            System.out.println("Tv2 включен:" + tv2.isTvWork());
            System.out.println("Текущий канал Tv2: " + tv2.getChannel());
            System.out.println();

            Tv tv3 = new Tv(); //проверяем , что по умолчанию теелвизор выключен
            System.out.println("Tv3 включен:" +  tv3.isTvWork());
            System.out.println("Текущий канал Tv3: " + tv3.getChannel());
            System.out.println();

            Tv tv4 = new Tv(); //включаем телевизор, если передали номер тв канала
            tv4.setChannel(8);
            //tv4.setChannel(-4); тут проверили, что возвращаем ошибку, если канал задан не верно
            System.out.println("Tv4 включен:" + tv4.isTvWork());
            System.out.println("Текущий канал Tv4: " + tv4.getChannel());
            System.out.println();
        }

    }










