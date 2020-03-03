package ru.job4j.array;

/**
 * Класс для упр. 6.5.1. Поиск минимального числа в массиве.[#244911]
 * @author Kirill Asmanov
 * @since 03.03.2020
 * @version 1.0.0;
 */

public class Min {
    /**
     * Метод находит в массиве минимальный элемент
     * @param array - исходный массив
     * @return - минимальный элемент
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            // проверить, что эталон больше, чем элемент. записать в эталон элемент массива.
            if (min>array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
