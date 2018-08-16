package ru.zinnurov.task2;

public class money {
    public static void main(String[] args) {
        int money = Integer.parseInt(args[0]); // Зарплата.

        int salary = (money * 87) / 100; // Зарплата чистыми.

        System.out.println("Ваша зарплата, с учетом НДФЛ, будет составлять: " + salary + " рублей.");
    }
}
