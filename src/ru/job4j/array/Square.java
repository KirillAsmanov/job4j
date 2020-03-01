package ru.job4j.array;

/**
 * Класс для заполнения массива числами, возведенными в квадрат, упр. 6.0.4. Заполнить массив степенями чисел.[#244901]
 * @author Kirill Asmanov
 * @since 01.02.2020
 * @version 1.0.0;
 */

public class Square {
    /**
     * Этот метод возводит в квадрат значение индекса текущей ячейки и записывает это значение в эту ячейку
     * @param bound - определяет размер массива
     * @return заполненный квадратами индексов массив
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < rst.length; index++) {
            rst[index] = index*index;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
