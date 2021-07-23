package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return third > max(first, second) ? third : max(first, second);
    }

    public static int max(int first, int second, int third, int four) {
        return four > max(first, second, third) ? four : max(first, second, third);
    }

    public static void main(String[] args) {
        System.out.println(Max.max(7, 8, 11, 2));
    }
}
