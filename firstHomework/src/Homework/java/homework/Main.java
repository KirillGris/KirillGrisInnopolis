package Homework.java.homework;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(3) ;// 0 - камень, 1 - ножницы, 2 - бумага
        int b = r.nextInt(3) ;
       // var c = if (x==0) return ("Камень");

        System.out.println("Вася: " + a);
        System.out.println("Петя: " + b);

        if (a==b) {
            System.out.println("Ничья!");
        }
        if (a==0 & b==1) {
            System.out.println("Вася, win!");
        }
        if (a==0 & b==2) {
            System.out.println("Петя, win!");
        }
        if (a==1 & b==0) {
            System.out.println("Петя, win!");
        }
        if (a==1 & b==2) {
            System.out.println("Вася, win!");
        }
        if (a==2 & b==0) {
            System.out.println("Вася, win!");
        }
        if (a==2 & b==1) {
            System.out.println("Петя, win!");
        }

    }
}

