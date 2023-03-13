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
            for (Employee temp: employeeList
                 ) {
                bufferedWriter.write(temp.toWriteCSV());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
