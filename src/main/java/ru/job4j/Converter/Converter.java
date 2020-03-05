package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static void main(String[] args) {
        int in = 420;
        int expectedEuro = 6;
        int expectedDollars = 7;
        int outEuro = rubleToEuro(in);
        int outDollars = rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollars = expectedDollars == outDollars;
        int euro = Converter.rubleToEuro(420);
        int dollars = Converter.rubleToDollar(420);
        System.out.println("140 rubles are " + euro + " euro; " + dollars + " dollars" + " Test result Euro/Dollars: " + passedEuro + " / " + passedDollars);
    }
}
