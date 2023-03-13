package case_study.cotroller;

import java.util.Scanner;

public class PromotionController {
    public void displayPromotionMenu(){
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("-----------------------------------");
            System.out.println("1.Display list customer use service");
            System.out.println("2.Display list customer get voucher");
            System.out.println("3. Return main menu");
            System.out.println("-------------------------------------");
            choice = sc.nextLine();
            switch (choice){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    new FuramaController().displayMainMenu();
                    break;
            }
        }while (!choice.equals("3"));
    }
}
