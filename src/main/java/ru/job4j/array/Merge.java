package ru.job4j.array;
import java.util.Arrays;

/**
 * 1. Экзамен. Базовый синтаксис.[#244963]. Решение экзаменационной задачи "Объединить два массива [#124482]".
 * @author Kirill Asmanov
 * @since 05.03.2020
 * @version 1.0.0;
 */

public class Merge {
    /**
     * Метод, который берет элементы из двух отсортированных массивов и добавляет в третий массив.
     * @param left - первый исходный массив
     * @param right - второй исходный массив
     * @return - отсортированный итоговый массив, состоящий из элементов двух входных массивов
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        while ((leftIndex + rightIndex) < rsl.length) {
            if (leftIndex == left.length) {
                rsl[leftIndex + rightIndex] = right[rightIndex];
                rightIndex++;
                continue;
            }
            if (rightIndex == right.length) {
                rsl[leftIndex + rightIndex] = left[leftIndex];
                leftIndex++;
                continue;
            }
            if (left[leftIndex] <= right[rightIndex]) {
                rsl[leftIndex + rightIndex] = left[leftIndex];
                leftIndex++;
            } else {
                rsl[leftIndex + rightIndex] = right[rightIndex];
                rightIndex++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 5, 6, 7, 8, 9},
                new int[] {1, 2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
