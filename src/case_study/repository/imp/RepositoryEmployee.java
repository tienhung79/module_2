package case_study.repository.imp;

import case_study.common.read.ReadEmployees;
import case_study.common.write.WriteEmployees;
import case_study.model.Employee;
import case_study.repository.IRepositoryEmployee;

import java.util.List;

public class RepositoryEmployee implements IRepositoryEmployee {
    String path = "src/case_study/data/dataEmployees.csv";
    @Override
    public List<Employee> getAll() {
        return ReadEmployees.readEmployee(path);
    }

    @Override
    public void addNew(String path, List<Employee> employeeList) {
        WriteEmployees.writeEmployees(path,employeeList);
    }

    @Override
    public void edit(int i, Employee employee, List<Employee> employeeList, String path) {
        employeeList.set(i,employee);
        WriteEmployees.writeEmployees(path,employeeList);
    }
}
