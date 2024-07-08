package HomeworckOOP;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int startNumber;
        int finishNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        startNumber = scanner.nextInt();
        System.out.println("Введите последнее число:");
        finishNumber = scanner.nextInt();

        System.out.printf("Среднее арифметическое всех целых чисел в диапазоне %d до %d равно %.2f", startNumber, finishNumber, getAverage(startNumber, finishNumber));
        System.out.println();
        System.out.printf("Среднее арифметическое чётных чисел в диапазоне %d до %d равно %.2f", startNumber, finishNumber, getAverageEvenNumber(startNumber, finishNumber));
    }

    public static double getAverage(int a, int b) {
        int j = 0;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
            j++;
        }

        return (double) sum / j;
    }

    public static double getAverageEvenNumber(int a, int b) {
        int j = 0;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
                j++;
            }
        }

        return (double) sum / j;
    }
}

