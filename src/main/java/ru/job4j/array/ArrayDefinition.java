package ru.job4j.array;

/**
 * Класс для создания массивов, упр. 6.0.1. Объявление массива.[#244924]
 * @author Kirill Asmanov
 * @since 01.02.2020
 * @version 1.0.0;
 */

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Кирилл";
        names[1] = "Андрей";
        names[2] = "Владимир";
        names[3] = "Евгений";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
