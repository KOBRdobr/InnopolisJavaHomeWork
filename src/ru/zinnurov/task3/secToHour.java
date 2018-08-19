package ru.zinnurov.task3;
import java.util.Scanner;

public class secToHour {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int second, hour;

        System.out.println("Укажите секунды");
        while(true) { // Проверка ввода и доволнителный шанс ввода

            if (in.hasNextInt()) {

                second = in.nextInt();// Пользователь вводит с клавиатуры сколько секунд.
                hour = ((second / 60) / 60); // Подсчет кол-ва часов в секундах.

                System.out.print("В " + second + " секундах, "); // Вывод.
                System.out.println(hour + " час(ов)."); // Вывод.
                break;
            }
            else {
                System.out.println("Не указаны секунды.");
                in.next();
            }
        }


    }
}
