package ru.job4j.array;

import javax.sound.sampled.AudioFormat;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    public static void main(String[] args) {
        int[][] arr = multiple(9);
        try (FileOutputStream out = new FileOutputStream("result.txt")) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                    out.write((arr[i][j] + " ").getBytes(StandardCharsets.UTF_8));
                }
                System.out.println();
                out.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
