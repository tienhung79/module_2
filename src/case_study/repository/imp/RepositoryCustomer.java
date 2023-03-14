package case_study.repository.imp;

import case_study.common.read.ReadCustomer;
import case_study.common.write.WriteCustomer;
import case_study.model.Customer;
import case_study.repository.IRepositoryCutomer;

import java.util.LinkedList;
import java.util.List;

public class RepositoryCustomer implements IRepositoryCutomer {

    String path = "src/case_study/data/dataCustomer.csv ";

    @Override
    public LinkedList<Customer> disPlay() {
        return ReadCustomer.readCustomer(path);
    }

    @Override
    public void addCustomer(String path, List<Customer> customerList) {
        WriteCustomer.writeCustomer(path, (LinkedList<Customer>) customerList);
    }

    @Override
    public void repairCustomer(int i, List<Customer> customerList, String path, Customer customer) {
        customerList.set(i,customer);
        WriteCustomer.writeCustomer(path, (LinkedList<Customer>) customerList);
    }

}
