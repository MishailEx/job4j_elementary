package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean base = data[0];
        for (boolean i : data) {
            if (i != base) {
                result = false;
                break;
            }
        }
        return result;
    }
}
