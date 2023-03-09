package product_manager.common;

import product_manager.model.Produce;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
    public static List<Produce> readWrite(String path){
        List<Produce> list = new ArrayList<>();
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader=new FileReader(path);
            bufferedReader =new BufferedReader(fileReader);
            String str = "";
            String[] array;
            Produce produce;
            while ((str=bufferedReader.readLine())!= null){
                array =str.split(",");
                produce = new Produce(Integer.parseInt(array[0]),array[1],Integer.parseInt(array[2]));
                list.add(produce);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
