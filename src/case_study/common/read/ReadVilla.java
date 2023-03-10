package case_study.common.read;

import case_study.common.write.WriteVilla;
import case_study.model.Villa;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadVilla {
    public static List<Villa> readVilla(String path){
        List<Villa> villaList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(path);
            bufferedReader= new BufferedReader(fileReader);
            String temp="";
            String[] tempArray;
            Villa villa;
            while ((temp= bufferedReader.readLine())!=null){
                tempArray = temp.split(",");
                villa = new Villa(tempArray[0],Integer.parseInt(tempArray[1]),Integer.parseInt(tempArray[2]),Integer.parseInt(tempArray[3]),tempArray[4],tempArray[5],Integer.parseInt(tempArray[6]),Integer.parseInt(tempArray[7]));
                villaList.add(villa);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            WriteVilla.writeVilla(path,villaList);
        }
        return villaList;
    }
}
