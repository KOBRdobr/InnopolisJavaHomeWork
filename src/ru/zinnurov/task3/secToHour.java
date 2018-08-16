package ru.zinnurov.task3;

public class secToHour {
    public static void main(String[] args) {
        int second = Integer.parseInt(args[0]); //Секунды (Перевод из строки в число).

        int hour = ((second / 60) /60); // Подсчет кол-ва часов в секундах.

        System.out.print("В " + second + " секундах, "); // Вывод.
        System.out.println(hour + " час(ов)."); // Вывод.


    }
}
