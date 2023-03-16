package case_study.common.read;

import case_study.common.write.WriteHouse;
import case_study.model.House;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ReadHouse {
    public static LinkedHashMap<House,Integer> readHouse(String path){
        LinkedHashMap<House,Integer> houseList = new LinkedHashMap<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader =null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String temp="";
            String[] tempArray;
            House house;
            while ((temp= bufferedReader.readLine())!=null){
                tempArray = temp.split(",");
                house = new House(tempArray[0],Integer.parseInt(tempArray[1]),Integer.parseInt(tempArray[2]),Integer.parseInt(tempArray[3]),tempArray[4],tempArray[5],Integer.parseInt(tempArray[6]));
                int value= Integer.parseInt(tempArray[7]);
                houseList.put(house,value);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            WriteHouse.writeHouse(path,houseList);
        }
        return houseList;
    }
}
