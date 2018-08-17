package ru.zinnurov.task1;
import java.util.Scanner;

public class fuel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fuelLiter = 0; // Колличество литров бензина.

        boolean flag = true; // истина - введено НЕ число. Ложь - введено число

        while(flag) { // Проверка ввода и доволнителный шанс ввода
            try { // Отработка исключений
                fuelLiter = in.nextInt();
                flag = false;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Введите число!");
                in.next();
            }
        }

        if(fuelLiter > 0) {

            System.out.println(" - Вторая колонка, 92-ой, " + fuelLiter + " литров. Спасибо.");
            System.out.println(" - С Вас " + (fuelLiter * 43) + " рублей.");
        }
        else System.out.print("Вы не сказали сколько литров Вам нужно.");
    }
}
