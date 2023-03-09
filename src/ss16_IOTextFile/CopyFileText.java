package ss16_IOTextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu: " + i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        Character a ='a';
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter=null;

        try {
            fileWriter = new FileWriter("src/ss16_IOTextFile/Name.csv");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Integer temp : array
            ) {
                bufferedWriter.write(temp.toString());
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
           e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

