package ru.zinnurov.task1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class fuel {
    public static void main(String[] args) {

        if(args.length > 0) {
            int fuelLiter = Integer.parseInt(args[0]); // Колличество литров бензина.

            System.out.println(" - Вторая колонка, 92-ой, " + fuelLiter + " литров. Спасибо.");
            System.out.println(" - С Вас " + (fuelLiter * 43) + " рублей.");
        }
        else System.out.print("Вы не сказали сколько литров Вам нужно.");
    }
}
