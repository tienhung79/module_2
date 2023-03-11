package ss17_io_binaryFile_serialization.product.common;

import ss17_io_binaryFile_serialization.product.model.Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Product> read(String path){
        List<Product> list = new ArrayList<>();
        FileInputStream fileInputStream ;
        ObjectInputStream objectInputStream;
        try{
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
              list = (List<Product>) objectInputStream.readObject();
              fileInputStream.close();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            WriteFile.writeFile(path,list);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
