package ru.zinnurov.task1;

public class fuel {
    public static void main(String[] args) {

        int fuelLiter = Integer.parseInt(args[0]); // Колличество литров бензина.

        System.out.println(" - Вторая колонка, 92-ой, " + fuelLiter + " литров. Спасибо.");
        System.out.println(" - С Вас " + (fuelLiter * 43) + " рублей." );
    }
}
