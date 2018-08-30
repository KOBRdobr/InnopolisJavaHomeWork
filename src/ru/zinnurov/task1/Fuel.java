package ru.zinnurov.task1;
import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {

        final int GAS_PRICE = 43;

        Scanner in = new Scanner(System.in);
        System.out.println("Сколько литров безнина вам нужно?");

        int fuelLiter;

        while (true) {
            if (in.hasNextInt()) {

                fuelLiter = in.nextInt(); //Пользователь вводит с клавиатуры сколько ему нужно топлива.
                if(fuelLiter != 0 && fuelLiter > 0) {
                    System.out.println(" - Вторая колонка, 92-ой, " + fuelLiter + " литров. Спасибо.");
                    System.out.println(" - С Вас " + (fuelLiter * GAS_PRICE) + " рублей.");
                    break;
                }
                else {
                    System.out.println("Введите число больше 0!");
                    continue;
                }

            } else  {
                System.out.println("Вы не сказали сколько литров Вам нужно.");
                in.next();
            }
        }
    }
}
