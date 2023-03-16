package case_study.service.imp;

import case_study.common.read.ReadRoom;
import case_study.common.write.WriteRoom;
import case_study.model.Room;

import java.util.LinkedHashMap;
import java.util.Scanner;
//String serviceName, int areaUse, int price, int peopleMax, String date, String serviceFree

public class ServiceRoom {

    public static void addRoom() {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Room,Integer>roomIntegerLinkedHashMap =ReadRoom.readRoom("src/case_study/data/dataRoom.csv");
        System.out.println("Nhập tên dịch vụ");
        String name = "Room";
        System.out.println("Nhập diện tích sử dụng");
        int areaUse = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số người");
        int peopleMax = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập thời gian thuê");
        String date = sc.nextLine();
        System.out.println("Nhập dịch vụ miễn phí");
        String serviceFree = sc.nextLine();
        Room room = new Room(name,areaUse,price,peopleMax,date,serviceFree);
        roomIntegerLinkedHashMap.put(room,0);
        WriteRoom.writeRoom("src/case_study/data/dataRoom.csv",roomIntegerLinkedHashMap);
    }
}
