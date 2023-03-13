package case_study.cotroller;

import java.util.Scanner;

public class EmployeeController {
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
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    new FuramaController().displayMainMenu();
                    break;
            }
        } while (!choice.equals("4"));
    }
}
