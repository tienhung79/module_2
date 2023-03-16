package case_study.common.read;

import case_study.common.write.WriteCustomer;
import case_study.model.Customer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadCustomer {
    public static LinkedList<Customer> readCustomer(String path) {
        LinkedList<Customer> customerList = new LinkedList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String temp = "";
            Customer customer;
            String[] tempArr;
            while ((temp = bufferedReader.readLine()) != null) {
                tempArr = temp.split(",");
                customer = new Customer(Integer.parseInt(tempArr[0]), tempArr[1], tempArr[2], tempArr[3], Integer.parseInt(tempArr[4]),tempArr[5], tempArr[6], tempArr[7], tempArr[8]);
                customerList.add(customer);
            }

        } catch (FileNotFoundException e) {
            System.out.println("bi loi");
        } catch (IOException e) {
            WriteCustomer.writeCustomer(path, customerList);
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        return customerList;
    }
}
