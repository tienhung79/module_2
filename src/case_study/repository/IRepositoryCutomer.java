package case_study.repository;

import case_study.model.Customer;

import java.util.LinkedList;
import java.util.List;

public interface IRepositoryCutomer {
    LinkedList<Customer> disPlay();

    void addCustomer(String path, List<Customer> customerList);


    void repairCustomer(int i, List<Customer> customerList, String path, Customer customer);

}
