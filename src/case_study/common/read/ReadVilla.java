package case_study.common.read;

import case_study.common.write.WriteVilla;
import case_study.model.Villa;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadVilla {
    public static LinkedHashMap<Villa,Integer> readVilla(String path){
        LinkedHashMap<Villa,Integer> villaList = new LinkedHashMap<>();
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
//                String id,String serviceName, int areaUse, int price, int peopleMax, String date, String standardsRoom, int areaSwimPooll, int numberOfFloorsVilla
                villa = new Villa(tempArray[0],tempArray[1],Integer.parseInt(tempArray[2]),Integer.parseInt(tempArray[3]),Integer.parseInt(tempArray[4]),tempArray[5],tempArray[6],Integer.parseInt(tempArray[7]),Integer.parseInt(tempArray[8]));
                int value =Integer.parseInt(tempArray[9]);
                villaList.put(villa,value);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            WriteVilla.writeVilla(path,villaList);
        }
        return villaList;
    }
}
