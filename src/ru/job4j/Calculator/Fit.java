package ru.job4j.Calculator;

public class Fit  {
    public static double manWeight(double height) {
        double rsl = (height - 100)*1.15;
        return rsl;
    }


    public static double womanWeight(double height) {
        double rsl = (height - 110)*1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(170);
        double woman = Fit.womanWeight(155);
        System.out.println("Man 100 is " + man);
        System.out.println("Woman 155 is " + woman);
    }
}
