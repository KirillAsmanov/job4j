package ru.job4j.array;
/**
 * Упр. 6.7.1. Моно строка в матрице.[#244913]
 * @author Kirill Asmanov
 * @since 04.03.2020
 * @version 1.0.0;
 */
public class MatrixCheck {
    /**
     * Метод проверяет, что строка в двухмерном массива целиком заполнена символом 'X'
     * @param board - проверяемый двумерный массив
     * @param row - проверяемая строка в массиве
     * @return - true/false в зависимости от того есть или нет строки соответственно
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i<board[row].length; i++) {
            if (board[row][i]!='X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
