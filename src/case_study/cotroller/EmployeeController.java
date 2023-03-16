package case_study.cotroller;

import case_study.service.IServiceEmployee;
import case_study.service.imp.ServiceEmployee;

import java.util.Scanner;

public class EmployeeController {
    IServiceEmployee iServiceEmployee = new ServiceEmployee();
    public void displayEmployeeMenu() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("----------------------------");
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Return main menu");
            System.out.println("---------------------------");
            System.out.print("Choice:");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    iServiceEmployee.disPlay();
                    break;
                case "2":
                    iServiceEmployee.addNew();
                    break;
                case "3":
                    iServiceEmployee.edit();
                    break;
                case "4":
                    new FuramaController().displayMainMenu();
                    break;
            }
        } while (!choice.equals("4"));
    }
}
