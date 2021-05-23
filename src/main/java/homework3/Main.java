package homework3;


import java.util.Random;
import java.util.Scanner;

public class Main {
    //1 Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).


    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Программа загадывает случайное число от 0 до 9, Вам нужно угадать это число за три попытки");
        int finish;
        do {
        Random b = new Random();
        int x = b.nextInt(10);
       // System.out.println(x); //Выводим загаданное число из рандома для проверки решения;
            System.out.println("Введите случайное число от 0 до 9");
            int counter = 0;

            while (counter < 3) {
                int a = sc.nextInt();
                System.out.println("Вы ввели число " + a);
                if (a > x) {
                    System.out.println("Мимо, Вы ввели число " + a + " которое больше загаданного.");


                } else if (a < x) {
                    System.out.println("Мимо, Вы ввели число " + a + " которое меньше закагаданного.");


                } else if (a == x) {
                    System.out.println("Ура!!! Вы угадали! ");
                    break;
                }
                counter++;
            }
            System.out.println("сыгрем ещё раз? 1 - да, 0 - нет ");
                finish = sc.nextInt();

        }
        while (finish == 1);
        System.out.println("Прощай");

    }
}