package Homework.java.homework.Tv;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Homework.java.homework.Tv.Tv tv = new Homework.java.homework.Tv.Tv();
        //System.out.println(tv.isTvWork());
        //System.out.println(tv.getChannel());
        tv.turnOn();
        Scanner sc = new Scanner(System.in);
        System.out.println("введите номер телеканала: ");
        int channelNumber = sc.nextInt();
        tv.setChannel(channelNumber);
        System.out.println(tv.isTvWork());
        System.out.println("Текущий канал Tv1: "+ tv.getChannel());

        Homework.java.homework.Tv.Tv tv2 = new Homework.java.homework.Tv.Tv();
        tv.turnOn();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("введите номер телеканала: ");
        int channelNumber2 = sc2.nextInt();
        tv.setChannel(channelNumber2);
        System.out.println(tv.isTvWork());
        System.out.println("Текущий канал Tv2: "+ tv.getChannel());

        Homework.java.homework.Tv.Tv tv3 = new Homework.java.homework.Tv.Tv();
        tv.turnOff();
        tv.turnOn();
        System.out.println(tv.isTvWork());
        System.out.println("Текущий канал Tv3: "+ tv.getChannel());
    }
}










