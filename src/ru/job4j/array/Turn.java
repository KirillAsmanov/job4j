package ru.job4j.array;
/**
 * упр. 6.2.3. Перевернуть массив.[#244919]
 * @author Kirill Asmanov
 * @since 02.03.2020
 * @version 1.0.0;
 */
public class Turn {
    /**
     * Данный метод реализует переворачивание элементов массива в обратном порядке
     * @param array - исходный массив
     * @return - перевернутый массив
     */
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
