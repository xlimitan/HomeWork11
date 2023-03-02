public class Main {

    public static void printYear(int allYear) {
        if (allYear % 4 == 0 && allYear % 100 != 0 || allYear % 400 == 0) {
            System.out.println(allYear + " год является високостным");
        } else {
            System.out.println(allYear + " год не является високостным");
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
    }
    public static void task3() {
        System.out.println("Задача 3");
    }
}