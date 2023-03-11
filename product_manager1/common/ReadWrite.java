package product_manager.common;

import product_manager.model.Produce;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
    public static List<Produce> readWrite(String path){
        List<Produce> list = new ArrayList<>();
        BufferedInputStream bufferedInputStream =null;
        FileInputStream fileInputStream = null;
        try {
           fileInputStream = new FileInputStream(path);
           bufferedInputStream = new BufferedInputStream(fileInputStream);
            String str = "";
            String[] array;
            Produce produce;
            while ((str= String.valueOf(bufferedInputStream.read()))!= null){
                bufferedInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
