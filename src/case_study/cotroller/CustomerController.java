package case_study.cotroller;

import case_study.service.IServiceCustomer;
import case_study.service.imp.ServiceCustomer;

import java.util.Scanner;

public class CustomerController {
    IServiceCustomer iServiceCustomer = new ServiceCustomer();
    public void displayCustomerMenu() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("-----------------------------");
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customers");
            System.out.println("3.Edit customers");
            System.out.println("4.Return main menu");
            System.out.println("------------------------------");
            System.out.print("Choice:");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    iServiceCustomer.disPlay();
                    break;
                case "2":
                    iServiceCustomer.addNew();
                    break;
                case "3":
                    iServiceCustomer.edit();
                    break;
                case "4":
                    new FuramaController().displayMainMenu();
                    break;
            }
        } while (!choice.equals("4"));
    }
}
