package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        short height2 = 168;
        double man = Fit.manWeight(height);
        double women = Fit.womanWeight(height2);
        System.out.println("Man 187 is " + man);
        System.out.println("Women 168 is" + women);
    }
}
