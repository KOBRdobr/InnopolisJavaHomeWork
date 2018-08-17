package ru.zinnurov.task2;
import java.util.Scanner;

public class money {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int money = 0; // Зарплата.

        boolean flag = true; // истина - введено НЕ число. Ложь - введено число

        while(flag) { // Проверка ввода и доволнителный шанс ввода
            try { // Отработка исключений
                money = in.nextInt();
                flag = false;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Введите число!");
                in.next();
            }
        }

        if(money > 0) {

            int salary = (int) (money * 0.87); // Зарплата чистыми.

            System.out.println("Зарплата по договору: " + money);
            System.out.println("Ваша зарплата, с учетом НДФЛ, будет составлять: " + salary + " рублей.");
        }
        else System.out.print("Укажите зарплату");
    }
}
