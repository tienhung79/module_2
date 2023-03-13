package case_study.common.read;

import case_study.common.write.WriteCustomer;
import case_study.model.Customer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCustomer {
    public static List<Customer>  readCustomer(String path){
        List<Customer> customerList = new ArrayList<>();
        FileReader fileReader =null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String temp = "";
            Customer customer;
            String[] tempArr;
            while ((temp = bufferedReader.readLine())!=null){
                tempArr=temp.split(",");
                customer = new Customer(Integer.parseInt(tempArr[0]),tempArr[1],tempArr[2],Boolean.parseBoolean(tempArr[3]),Integer.parseInt(tempArr[4]),Integer.parseInt(tempArr[5]),tempArr[6],tempArr[7],tempArr[8]);
                customerList.add(customer);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            WriteCustomer.writeCustomer(path,customerList);
        }
        return customerList;
    }
}
