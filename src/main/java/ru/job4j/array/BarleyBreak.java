package ru.job4j.array;

/**
 * Упр. 6.6.1. Двухмерный массив. Вывод на консоль.[#244922]
 * @author Kirill Asmanov
 * @since 04.03.2020
 * @version 1.0.0;
 */

public class BarleyBreak {
    /**
     * Точка входа, осуществляет заполнение двумерного массива цифрами от 1 до 9 и вывод его в консоль
     * @param args - args
     */
    public static void main(String[] args) {
        int[][] table = new int[3][3];
        int elements = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                elements += 1;
                table[i][j] = elements;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
