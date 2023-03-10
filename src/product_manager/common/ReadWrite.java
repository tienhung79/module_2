package product_manager.common;

import product_manager.model.Produce;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {
    public static List<Produce> readWrite(String path){
        List<Produce> list = new ArrayList<>();
        BufferedInputStream bufferedInputStream;
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        try {
           fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
//           bufferedInputStream = new BufferedInputStream(objectInputStream);
              list = (List<Produce>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
