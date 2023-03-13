package case_study.common.write;

import case_study.model.Villa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteVilla {
    public static void writeVilla(String path, List<Villa>villaList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(villaList.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
