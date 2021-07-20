package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        int ivanProgress = ivan;
        int nikProgress = nik;
        while (nikProgress >= ivanProgress) {
            nikProgress *= 2;
            ivanProgress *= 3;
            month++;
        }
        return month;
    }
}
