package ss16_IOTextFile;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String str;
        try {
            fileReader = new FileReader("src/ss16_IOTextFile/source.csv");
            fileWriter = new FileWriter("src/ss16_IOTextFile/target.csv", true);
            reader = new BufferedReader(fileReader);
            writer = new BufferedWriter(fileWriter);
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                str = line;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != ' ') {

                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file không tồn tại");
        } catch (NullPointerException e) {
            System.out.println("file trống");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

