package HomeworckOOP;

import java.util.Scanner;

public class DigitsNumbers {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        int sumOdd = 0;
        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        number = scanner.nextInt();

        if (number < 0) {
            number = -number;
        }

        for (int i = number; i != 0; i /= 10) {

            int digit = i % 10;

            sum += digit;
            if (checkOdd(digit)){
                sumOdd += digit;
            }

            max = getMax(digit, max);
        }

        System.out.println("Сумма цифр введенного числа равна " + sum);
        System.out.println("Сумму нечетных цифр введенного числа равна " + sumOdd);
        System.out.println("Максимальная цифра числа равна " + max);
    }

    public static boolean checkOdd(int i) {
        return i % 2 != 0;
    }

    public static int getMax (int a, int b) {
        return Math.max(a, b);
    }
}
