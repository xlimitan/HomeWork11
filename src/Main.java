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
    }
}