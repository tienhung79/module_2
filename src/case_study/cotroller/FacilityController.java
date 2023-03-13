package case_study.cotroller;

import java.util.Scanner;

public class FacilityController {

    public void displayFacilityMenu(){
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("----------------------------");
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility maintenance");
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
