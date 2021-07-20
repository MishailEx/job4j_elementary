package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(prices.length);
        System.out.println(surname.length);
        String[] names = new String[4];
        names[0] = "Vadim Ivanov";
        names[1] = "Oleg Petrov";
        names[2] = "Roman Smirnov";
        names[3] = "Vlad Antonov";
        System.out.println(names[0] + ", " + names[1] + ", " + names[2] + ", " + names[3]);
    }
}
