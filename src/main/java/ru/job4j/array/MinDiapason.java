package ru.job4j.array;
/**
 * Класс для упр. 6.5.2. Поиск минимума в диапазоне.[#244912]
 * @author Kirill Asmanov
 * @since 03.03.2020
 * @version 1.0.0;
 */
public class MinDiapason {
    /**
     * Метод, осуществляющий поиск минимального числа среди ячеек заданного диапазона
     * @param array - входящий массив
     * @param start - индекс начала диапазона
     * @param finish - индекс конца диапазона
     * @return - минимальное значение
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
            for (int i = start; i <= finish; i++) {
                if (min>array[i]) {
                    min = array[i];
                }
            }
        return min;
    }
}
