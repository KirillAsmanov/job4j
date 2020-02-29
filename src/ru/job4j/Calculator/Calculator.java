package ru.job4j.Calculator;

/**
 * Класс для вычисления арифметических операций, решение задачи "3. Арифметические операции. [#185]"
 * @author Kirill Asmanov
 * @since 27.02.2020
 * @version 1.0.0;
 */

public class Calculator {
    /**
     * Метод main, производит вычисления и выводит результаты арифметических операций в консоль
     * @param args - args
     */
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int six = 6;
        int four = 4;
        int five = 5;

        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
    }
}
