package ru.job4j.array;

/**
 * Класс для упр. 6.1. Классический поиск перебором.[#244902]
 * @author Kirill Asmanov
 * @since 01.03.2020
 * @version 1.0.0;
 */

public class FindLoop {
    /**
     * Метод, осуществляющий поиск перебором в массиве и выводящий индекс найденного элемента
     * @param data - массив, в котором осуществляется поиск
     * @param el - искомый элемент
     * @return - индекс искомого элемента
     */
    public int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод, осуществляющий поиск перебором в массиве в заданном диапазоне элементов и выводящий индекс найденного элемента
     * @param data - массив чисел
     * @param el - искомый элемент
     * @param start - индекс первого элемента в диапазоне поиска
     * @param finish - индекс последнего элемента в диапазоне поиска
     * @return - индекс найденного в диапазоне элемента
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rsl = -1;

        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}
