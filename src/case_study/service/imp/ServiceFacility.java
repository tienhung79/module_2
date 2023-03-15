package case_study.service.imp;

import case_study.cotroller.FacilityController;
import case_study.service.IServiceFacility;

import java.util.Scanner;

public class ServiceFacility implements IServiceFacility {
    @Override
    public void disPlay() {

    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void choiceAdd() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("----------------------");
            System.out.println("1: Add new villa");
            System.out.println("2: Add new house");
            System.out.println("3: Add new room");
            System.out.println("4: Back to menu");
            System.out.println("------------------------");
            System.out.println("Choice: ");
            choice = sc.nextLine();
            switch (choice){
                case "1":
                    ServiceVilla.addVilla();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    FacilityController.displayFacilityMenu();
                    break;
            }
        }while (!choice.equals("4"));
    }
}
