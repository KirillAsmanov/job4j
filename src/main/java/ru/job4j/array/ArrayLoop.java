package ru.job4j.array;

/**
 * Класс для заполнения и вывода массива в консоль при помощи цикла for, упр. 6.0.3. Массивы и цикл for.[#244917]
 * @author Kirill Asmanov
 * @since 01.02.2020
 * @version 1.0.0;
 */

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i * 2) + 3;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
