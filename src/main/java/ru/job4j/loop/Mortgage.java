package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double currentSum = amount;
        while (currentSum>0){
            currentSum = currentSum + currentSum*(percent/100) - salary;
            year+=1;
        }
        return year;
    }
}
