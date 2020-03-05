package ru.job4j.array;
/**
 * Упр. 6.6.2. Двухмерный массив. Таблица умножения.[#244903]
 * @author Kirill Asmanov
 * @since 04.03.2020
 * @version 1.0.0;
 */
public class Matrix {
    /**
     * Метод создает квадратный двухмерный массив величины size и заполняет его таблицей умножения до числа size
     * @param size - указатель размера массива
     * @return - массив, содержащий таблицу умножения
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        return table;
    }

}
