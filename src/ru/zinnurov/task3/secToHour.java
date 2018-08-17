package ru.zinnurov.task3;
import java.util.Scanner;

public class secToHour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int second = 0; //Секунды (Перевод из строки в число).

        boolean flag = true; // истина - введено НЕ число. Ложь - введено число

        while(flag) { // Проверка ввода и доволнителный шанс ввода
            try { // Отработка исключений
                second = in.nextInt();
                flag = false;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Введите число!");
                in.next();
            }
        }
        if(second > 0) {

            int hour = ((second / 60) / 60); // Подсчет кол-ва часов в секундах.

            System.out.print("В " + second + " секундах, "); // Вывод.
            System.out.println(hour + " час(ов)."); // Вывод.
        }
        else System.out.print("Не указаны секунды.");


    }
}
