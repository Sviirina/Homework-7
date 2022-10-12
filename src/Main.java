public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1
        System.out.println("Домашнее задание 1");
        //Задача 1
        System.out.println("Задача 1");
        int monthNumber = 1;
        int summ = 0;
        while (summ <= 2_459_000) {
            summ += 15000;
            System.out.println("Месяц " + monthNumber + " , сумма накоплений равна " + summ + " рублей ");
            monthNumber++;
        }

        //Задача 2
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int deathRate = 8 * population / 1000;
        for (int c = 1; c <= 10; c++) {
            population += birthRate;
            population -= deathRate;
            System.out.println("Год " + c + ", численность населения составляет " + population);
        }
        //Домашнее задание 2
        System.out.println("Домашнее задание 2");
        //Задача 1
        System.out.println("Задача 1");
        int sum = 15000;
        int monthN = 1;
        while (sum <= 12_000_000) {
            sum *= 1.07;
            System.out.println("Месяц " + monthN + " сумма накоплений равна " + sum);
            monthN++;
        }

        //Задача 2
        System.out.println("Задача 2");
        int sum1 = 15000;
        int monthN1 = 1;
        while (sum1 <= 12_000_000) {
            sum1 *= 1.07;
            if (monthN1 % 6 == 0) {
                System.out.println("Месяц " + monthN1 + " сумма накоплений равна " + sum1);
            }
            monthN1++;
        }

        //Задача 3
        System.out.println("Задача 3");
        int sum2 = 15000;
        int monthN2 = 1;
        while (monthN2 <= 9 * 12) {
            sum2 *= 1.07;
            if (monthN2 % 6 == 0) {
                System.out.println("Месяц " + monthN2 + " сумма накоплений равна " + sum2);
            }
            monthN2++;
        }

        //Задача 4
        System.out.println("Задача 4");
        int firstFriday = 1;
        for (int numberFriday = firstFriday; numberFriday <= 31; numberFriday += 7)
            System.out.println("Сегодня пятница, " + numberFriday + "ое число. Необходимо подготовить отчет.");

        //Домашнее задание 3
        System.out.println("Домашнее задание 3");
        //Задача 1
        System.out.println("Задача 1");
        int currentYear = 2022;
        int firstYear = currentYear - 200;
        int lastYear = currentYear + 100;
        for (int x = firstYear; x < lastYear; ++x) {
            if (x % 79 == 0) {
                System.out.println(x);
            }
        }

        //Задача 2
        System.out.println("Задача 2");
        for (int v = 1; v <= 10; v++) {
            System.out.println("2 * " + v + " = " + 2 * v);
        }

    }
}