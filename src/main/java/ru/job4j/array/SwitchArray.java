package ru.job4j.array;

/**
 * упр. 6.2.1. Выход за границу массива.[#244920]
 * @author Kirill Asmanov
 * @since 01.03.2020
 * @version 1.0.0;
 */

public class SwitchArray {
    /**
     * Ошибка была в том, что максимальный индекс массива равен не его длине, а (длине - 1).
     * @param array - входящий массив чисел
     * @return массив, в котором поменяны местами нулевой и последний элемент
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * Меняет местами значения с заданными индексами
     * @param array - исходный массив
     * @param source - индекс элемента, на который мы меняем
     * @param dest - индекс элемента, который будет меняться
     * @return - массив, в котором два заданных элемента были заменены между собой
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }


    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
