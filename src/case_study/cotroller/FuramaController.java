package case_study.cotroller;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("-------------------------");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management ");
            System.out.println("4.Booking Management ");
            System.out.println("5.Promotion Management ");
            System.out.println("6.Exit ");
            System.out.println("--------------------------");
            System.out.print("Choice:");
            choice=sc.nextLine();
            switch (choice){
                case "1":
                    new EmployeeController().displayEmployeeMenu();
                    break;
                case "2":
                    new CustomerController().displayCustomerMenu();
                    break;
                case "3":
                    new FacilityController().displayFacilityMenu();
                    break;
                case "4":
                    break;
                case "5":
                    new PromotionController().displayPromotionMenu();
                    break;
                case "6":
                    break;

            }
        }while (!choice.equals("6"));


    }
}
