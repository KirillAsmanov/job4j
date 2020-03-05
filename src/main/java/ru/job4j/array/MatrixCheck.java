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
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод проверяет, что столбец в двухмерном массиве целиком заполнен символом 'X'
     * @param board - проверяемый двумерный массив
     * @param column - проверяемый столбец в массиве
     * @return - true/false в зависимости от того есть или нет столбца соответственно
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Метод переносит диагональ двумерного массива в новый массив
     * @param board - проверяемый двумерный массив
     * @return массив из диагонали
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Метод проверяет, находится ли на поле выигрышная комбинация
     * @param board - входит игровое поле
     * @return - true/false в зависимости от наличия выигрышной ситуации
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if ((board[i][i] == 'X') && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }

}
