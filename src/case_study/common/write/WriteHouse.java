package case_study.common.write;

import case_study.model.House;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WriteHouse {
    public static void writeHouse(String path, LinkedHashMap<House,Integer> houseList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<House,Integer> temp: houseList.entrySet()
                 ) {
                bufferedWriter.write(temp.getKey().toWriteCSV()+","+"0");
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
