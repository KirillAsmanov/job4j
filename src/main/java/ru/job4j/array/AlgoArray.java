package ru.job4j.array;
/**
 * Класс для ручной сортировки по возрастанию значений в массивах, упр. 6.2. Упорядочить массив.[#244926]
 * @author Kirill Asmanov
 * @since 01.03.2020
 * @version 1.0.0;
 */
public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0]; // переменная для временного хранения значение ячейки с индексом 0.
        array[0] = array[3]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
        array[3] = temp; // записываем в ячейку с индексом 3 значение временной переменной.

        temp = array[2];
        array[2] = array[1];
        array[1] = temp;

        temp = array[4];
        array[4] = array[3];
        array[3] = temp;


        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
