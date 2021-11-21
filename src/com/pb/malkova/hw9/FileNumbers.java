package com.pb.malkova.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileNumbers {
    public static void createNumbersFile() {
        Random rn = new Random();
        int[] integers = new int[100];
        for (int i = 0; i < 100; i++) {
            integers[i] = rn.nextInt(100);
        }
        Writer writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("./numbers.txt"));
            int count = 0;
            for (int i = 0; i < 100; i++) {
                writer.append(integers[i] + " ");
                count++;
                if (count % 10 == 0) {
                    writer.write("\n");
                }
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createOddNumbersFile() throws IOException {
        Path path = Paths.get("numbers.txt");
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("odd-numbers.txt"));
        int[] array = new int[100];
        int i = 0;
        try (Scanner scan = new Scanner(path)) {
            int count = 0;
            while (scan.hasNextInt()) {
                array[i] = scan.nextInt();
                count++;
                if ((array[i] % 2) == 0) {
                    array[i] = 0;
                }
                writer.append(array[i] + " ");
                if (count % 10 == 0) {
                    writer.write("\n");
                }
            }
            writer.close();
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        createNumbersFile();
        createOddNumbersFile();
    }
}
