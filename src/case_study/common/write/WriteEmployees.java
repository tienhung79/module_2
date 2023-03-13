package case_study.common.write;

import case_study.model.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteEmployees {
    public static void writeEmployees(String path, List<Employee> employeeList){
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter= new FileWriter(path);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(employeeList.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
