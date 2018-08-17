package ru.zinnurov.task2;

public class money {
    public static void main(String[] args) {
        if(args.length > 0) {
            int money = Integer.parseInt(args[0]); // Зарплата.

            int salary = (int) (money * 0.87); // Зарплата чистыми.

            System.out.println("Зарплата по договору: " + money);
            System.out.println("Ваша зарплата, с учетом НДФЛ, будет составлять: " + salary + " рублей.");
        }
        else System.out.print("Вы не указали зарплату по договору");
    }
}
