package ru.job4j.loop;

/**
 * Класс для вывода креста из символов в консоль, решение задачи "5.9. Крест в псевдографике. [#244972]"
 * @author Kirill Asmanov
 * @since 29.02.2020
 * @version 1.0.0;
 */

public class Slash {
    /**
     * Метод, рисующий крест в консоль с помощью символов (" " либо "0") в зависимости от индекса элемента
     * @param size - размер поля для построения креста
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (row == cell); // добавить условие, по которому нужно определить ставить ли символ или нет.
                boolean right = (row+cell) == (size-1); // добавить условие, что нужно ставить элемент в правый угол.
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Точка входа
     * @param args -args
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
        System.out.println("Draw by 9");
        draw(9);
    }
}
