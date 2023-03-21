public class Main {
    public static void main(String[] args) {
        System.out.println("Привет мир! ");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    private static void task10() {
        System.out.println(" зачада 10");
        int N = 2 ;
        for (int i = 1; i <= 10; i++) {
            System.out.println( N+ " * " +i+ " = " + N *i );
        }

    }

    private static void task9() {
        System.out.println(" Задача 9");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
    }

    private static void task8() {
        System.out.println(" Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println(" итого " +total);
        }
    }

    private static void task7() {
        System.out.println(" Задача 7");
        for (int i = 1; i < 1024; i = i * 2) {
            System.out.println(" Итерация цикла " + i);
        }

    }

    private static void task6() {
        System.out.println(" Задача 6 ");
        for (int i = 7; i < 105; i = i + 7){
            System.out.println(" Итерация цикла " + i);
        }

    }

    private static void task5() {
        System.out.println(" Задача 5 ");
        for (int i = 1904; i < 2100; i = i + 4){
            System.out.println("Високосный год " + i);
        }
    }

    private static void task4() {
        System.out.println(" Задача 4 ");
        for (int i = 10; i > -11; i = i -1){
            System.out.println(" Итерация цикла "+ i);
        }
    }

    private static void task3() {
        System.out.println(" Задача 3 ");
        for(int i = 2; i < 18; i = i + 2){
            System.out.println("Итерация цикла " + i);
        }

    }

    private static void task2() {
        System.out.println(" Задача 2");
        for(int i = 10; i > 0; i = i - 1){
            System.out.println("Итерация цикла " + i);
        }

    }

    private static void task1() {
        System.out.println(" Задача 1 ");
        for(int i = 1; i < 11; i = i + 1){
            System.out.println("Итерация цикла " + i);
        }
    }

}