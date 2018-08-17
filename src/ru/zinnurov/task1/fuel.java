package ru.zinnurov.task1;
import java.util.Scanner;

public class fuel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int fuelLiter = 0; // Колличество литров бензина.
        boolean flag = true;

        System.out.println("Сколько литров безнина вам нужно?");

        while (flag) {
            if (in.hasNextInt()) {

                fuelLiter = in.nextInt();
                System.out.println(" - Вторая колонка, 92-ой, " + fuelLiter + " литров. Спасибо.");
                System.out.println(" - С Вас " + (fuelLiter * 43) + " рублей.");
                flag = false;
            } else  {
                System.out.println("Вы не сказали сколько литров Вам нужно.");
                in.next();
            }
        }
    }
}
