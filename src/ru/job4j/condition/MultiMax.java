package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int firstAndSecond = first >= second ? first : second;
        int result = firstAndSecond >= third ? firstAndSecond : third;
        return result;
    }
}
