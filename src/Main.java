public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }

    private static void task1() {
        System.out.println("Задача 1");

        int age = 20;
        if(age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то, он совершеннолетний");
        }else {
            System.out.println("Если возраст человека равен " + age + " то, он несовершеннолетний");
        }

    }

    private static void task2() {
        System.out.println("Задача 2");

        int temperature = 4;

        if(temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }

    private static void  task3() {
        System.out.println("Задача 3");

        int speed = 59;

        if(speed > 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }
    }

    private static void task4() {
        System.out.println("Задача 4");

        int age = 8;

        if(age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
        } else if(age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу.");
        } else if(age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете.");
        } else if(age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу.");
        } else {
            System.out.println("Ты слишком мал");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int age = 4;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься только в сопровождении " +
                    "взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься без сопровождения взрослого.");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");

        int total = 102;

    }

}