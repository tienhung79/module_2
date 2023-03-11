package ss17_io_binaryFile_serialization.product.common;

import ss17_io_binaryFile_serialization.product.model.Product;

import java.io.*;
import java.util.List;

public class WriteFile {
    public static void writeFile(String path, List<Product> product){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream =null;
        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(product);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
