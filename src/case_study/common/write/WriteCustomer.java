package case_study.common.write;

import case_study.model.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class WriteCustomer {
    public static void writeCustomer (String path, LinkedList<Customer> customerList){
        FileWriter fileWriter ;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer temp: customerList) {
//                System.out.println(temp.toWriteCSV());
                bufferedWriter.write(temp.toWriteCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        finally {
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                System.out.println("file đã đóng");
//            }
//            try {
//                bufferedWriter.close();
//            } catch (IOException e) {
//                System.out.println("bộ nhớ đã đóng");
//            }
//        }
    }
}
