package case_study.repository.imp;

import case_study.common.read.ReadCustomer;
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
}
