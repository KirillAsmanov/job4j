package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = (number != 1) && (number != 0);
        for (int i = 2; i <= number; i++) {
            if (((number % i) == 0) && (number != i)) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}