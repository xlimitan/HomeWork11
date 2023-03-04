public class Main {
    public static void printYear(int allYear) {
        if (allYear % 4 == 0 && allYear % 100 != 0 || allYear % 400 == 0) {
            System.out.println(allYear + " год является високостным");
        } else {
            System.out.println(allYear + " год не является високостным");
        }
    }
    public static void readOs(int os, int year) {
        if (os == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int days (int allDistance) {
        int deliveryDays = 1;
        if (allDistance <= 20) {
            return deliveryDays;
        } else if (allDistance > 20 && allDistance <= 60) {
            return deliveryDays + 1;
        } else if (allDistance > 60 && allDistance <= 100) {
            return deliveryDays + 2;
        } else
        return deliveryDays + 3;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        printYear(year);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOs = 0;
        int clientDeviceYear = 2020;
        readOs(clientOs, clientDeviceYear);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        if (days(deliveryDistance) <= 3) {
            System.out.println("Потребуется дней: " + days(deliveryDistance));
        } else
            System.out.println("Свыше 100 км доставки нет");
    }
}