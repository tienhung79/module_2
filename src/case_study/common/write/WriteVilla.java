package case_study.common.write;

import case_study.model.Villa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WriteVilla {
    public static void writeVilla(String path, LinkedHashMap<Villa,Integer> villaList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Villa,Integer> temp:villaList.entrySet()
                 ) {
                bufferedWriter.write(temp.getKey().toWriteCSV()+","+"0");
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
