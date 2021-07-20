package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length);
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] data2 = sort(data);
        System.out.println(Arrays.toString(data2));

    }
}