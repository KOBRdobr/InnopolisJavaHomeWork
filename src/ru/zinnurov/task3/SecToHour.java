package ru.zinnurov.task3;
import java.util.Scanner;

public class SecToHour {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int second, hour;
        final int SECONDS = 60;

        System.out.println("Укажите секунды");
        while(true) { // Проверка ввода и доволнителный шанс ввода

            if (in.hasNextInt()) {
                second = in.nextInt();// Пользователь вводит с клавиатуры сколько секунд.
                if(second !=0 && second > 0) {
                    hour = ((second / SECONDS) / SECONDS); // Подсчет кол-ва часов в секундах.

                    System.out.print("В " + second + " секундах, "); // Вывод.
                    System.out.println(hour + " час(ов)."); // Вывод.
                    break;
                }
                else {
                    System.out.println("Введите число больше 0!");
                    continue;
                }
            }
            else {
                System.out.println("Не указаны секунды.");
                in.next();
            }
        }


    }
}
