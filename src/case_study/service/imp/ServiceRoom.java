package case_study.service.imp;

import case_study.common.read.ReadRoom;
import case_study.common.write.WriteRoom;
import case_study.format.FormatIdFacility;
import case_study.format.FormatNameFacility;
import case_study.model.Room;

import java.util.LinkedHashMap;
import java.util.Scanner;
//String serviceName, int areaUse, int price, int peopleMax, String date, String serviceFree

public class ServiceRoom {

    public static void addRoom() {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Room,Integer>roomIntegerLinkedHashMap =ReadRoom.readRoom("src/case_study/data/dataRoom.csv");
        String id;
        do {
            System.out.println("Nhập id");
             id = sc.nextLine();
             if (FormatIdFacility.regexRoom(id)){
                 break;
             }
        }while (true);
        String name;
       do {
           System.out.println("Nhâp tên phòng");
           name = sc.nextLine();
           if (FormatNameFacility.formatNameFacilityVilla(name)){
               break;
           }
       }while (true);
        int areaUse;
        do {
            System.out.println("Nhập diện tích sử dụng");
            System.out.println("Diện tích sử dụng lớn hơn 30");
          areaUse = Integer.parseInt(sc.nextLine());
        }while (areaUse<30);
        int price;
        do {
            System.out.println("Nhập giá ");
            System.out.println("Chi phí thuê phải lớn hơn 0");
             price = Integer.parseInt(sc.nextLine());
        }while (price<0);
        int peopleMax;
        do {
            System.out.println("Nhập số người");
            System.out.println("Số người phải lớn hơn 0 hoặc nhỏ hơn 20");
            peopleMax = Integer.parseInt(sc.nextLine());
        }while (peopleMax<0||peopleMax>20);
        System.out.println("Nhập thời gian thuê");
        String date = sc.nextLine();
        System.out.println("Nhập dịch vụ miễn phí");
        String serviceFree = sc.nextLine();
        Room room = new Room(id,name,areaUse,price,peopleMax,date,serviceFree);
        roomIntegerLinkedHashMap.put(room,0);
        WriteRoom.writeRoom("src/case_study/data/dataRoom.csv",roomIntegerLinkedHashMap);
    }
}
