package ru.job4j.array;

import java.util.Arrays;

//public class Machine {
//    public static int[] change(int money, int price) {
//        int[] coins = {10, 5, 2, 1};
//        int[] rsl = new int[100];
//        int size = 0;
//        size = money - price;
//        while (size > 0) {
//            for (int i = 0; i < coins.length; i++) {
//                if (size - coins[i] >= 0) {
//                    rsl[i] = coins[i];
//                    size -= coins[i];
//                    break;
//                }
//
//            }
//        }
//        return Arrays.copyOf(rsl, size);
//    }
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int j = 0;
        int change = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (change - coins[i] >= 0) {
                size++;
                rsl[j] = coins[i];
                change -= coins[i];
                j++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}