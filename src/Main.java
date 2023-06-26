import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();



    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    static public void task1() {
        /**
         * Бухгалтеры попросили посчитать сумму всех выплат за месяц.
         *Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
         * «Сумма трат за месяц составила … рублей».
         */
        System.out.println("Задача 1");

        int[ ] arr = generateRandomArray();

        int[] salary = new int[30];
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println();

    }

    public static void task2() {
        /**
         *Также бухгалтерия попросила найти минимальную и максимальную трату за день.
         *Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: ]
         * «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
         */
        System.out.println("Задача 2");

        int[ ] arr = generateRandomArray();

        int[] salary = new int[30];
        int maxSalary = arr[0];
        int minSalary = arr[0];
        for (final int current : salary) {
            if (current > maxSalary) {
                maxSalary = current;
            }
        }
        System.out.println(maxSalary);

        for (final int current : salary) {
            if (current < minSalary) {
                minSalary = current;
            }
        }
        System.out.println(minSalary);


        System.out.println();
    }

    static public void task3() {
        /**
         *Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
         * Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
         * и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
         * Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
         */
        System.out.println("Задача 3");

        int[ ] arr = generateRandomArray();

        int[] salary = new int[30];
        double sum = 0;
        for (int element : arr) {
            sum += element;
        }
            sum = sum / salary.length;
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");


        System.out.println();
    }

    public static void task4() {
        /**
         *В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону.
         * Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов — char[ ].
         * Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде. В качестве данных для массива используйте:
         *
         * char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
         *
         * В результате в консоль должно быть выведено: Ivanov Ivan.
         * Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
         */
        System.out.println("Задача 4");

        int[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = reverseFullName - 1; i >=0; i--)
        System.out.println(reverseFullName);




        System.out.println();
    }

}