package ru.job4j.array;
/**
 * Упр. 6.8. Дефрагментация массива.[#244923]
 * @author Kirill Asmanov
 * @since 04.03.2020
 * @version 1.0.0;
 */
public class Defragment {
    /**
     * Метод производит дефрагментацию массива (перемещает заполненные ячейки массива в начало, а пустые в конец)
     * @param array - входящий массив
     * @return - дефрагментированный массив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; // указатель, на не null ячейку.
                // переместить первую не null ячейку
                // Здесь нужен цикл while
                while ((array[point] == null) && (point < array.length - 1)) {
                    point++;
                }
                array[index] = array[point];
                array[point] = null;
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
