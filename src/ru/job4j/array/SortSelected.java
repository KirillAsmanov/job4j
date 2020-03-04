package ru.job4j.array;
/**
 * Упр. 6.5.3. Сортировка выборкой.[#244910]
 * @author Kirill Asmanov
 * @since 04.03.2020
 * @version 1.0.0;
 */
public class SortSelected {
    /**
     * Метод, реализующий сортировку выборкой по возрастанию с помощью классов MinDiapason и FindLoop
     * @param data - входящий неотсортированный массив
     * @return - отсортированный по возрастанию массив
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i<data.length; i++) {

            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);

            if (data[i] != data[index]) {
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
        }
        return data;
    }
}
