package ss17_io_binaryFile_serialization;

import java.io.*;

public class CoppyFile {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        int number1;
        try {
            fileInputStream = new FileInputStream("src/ss17_io_binaryFile_serialization/source.csv");
            fileOutputStream = new FileOutputStream("src/ss17_io_binaryFile_serialization/target.csv", true);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] buffer = new byte[1024];
            while ((number1 = bufferedInputStream.read())>0) {
               bufferedOutputStream.write(buffer,0,number1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file không tồn tại");
        } catch (NullPointerException e) {
            System.out.println("file trống");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }  finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
