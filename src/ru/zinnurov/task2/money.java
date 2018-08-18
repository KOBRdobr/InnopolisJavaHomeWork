package ru.zinnurov.task2;
import java.util.Scanner;

public class money {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int money = 0; // Зарплата.

        System.out.println("Укажите зарплату");

        while (true) {
            if (in.hasNextInt()) {
                money = in.nextInt();
                int salary = (int) (money * 0.87); // Зарплата чистыми.

                System.out.println("Зарплата по договору: " + money);
                System.out.println("Ваша зарплата, с учетом НДФЛ, будет составлять: " + salary + " рублей.");
                break;
            } else {
                System.out.println("Укажите зарплату");
                in.next();
            }
        }
    }
}
