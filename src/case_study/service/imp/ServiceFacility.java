package case_study.service.imp;

import case_study.common.read.ReadHouse;
import case_study.common.read.ReadRoom;
import case_study.common.read.ReadVilla;
import case_study.cotroller.FacilityController;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.service.IServiceFacility;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ServiceFacility implements IServiceFacility {
    @Override
    public void disPlay() {
        LinkedHashMap<Room,Integer> roomList = ReadRoom.readRoom("src/case_study/data/dataRoom.csv");
        for (Map.Entry<Room,Integer> temp :roomList.entrySet()
             ) {
            System.out.println(temp);
        }
        LinkedHashMap<House,Integer> houseIntegerLinkedHashMap= ReadHouse.readHouse("src/case_study/data/dataHouse.csv");
        for (Map.Entry<House,Integer> temp : houseIntegerLinkedHashMap.entrySet()
             ) {
            System.out.println(temp);
        }
        LinkedHashMap<Villa,Integer>villaIntegerLinkedHashMap= ReadVilla.readVilla("src/case_study/data/dataVilla.csv");
        for (Map.Entry<Villa,Integer> temp : villaIntegerLinkedHashMap.entrySet()
             ) {
            System.out.println(temp);
        }
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
                    ServiceHouse.addHouse();
                    break;
                case "3":
                    ServiceRoom.addRoom();
                    break;
                case "4":
                    FacilityController.displayFacilityMenu();
                    break;
            }
        }while (!choice.equals("4"));
    }
}
