package case_study.service.imp;

import case_study.common.read.ReadHouse;
import case_study.common.write.WriteHouse;
import case_study.format.FormatIdFacility;
import case_study.model.House;
import case_study.model.Room;

import java.util.LinkedHashMap;
import java.util.Scanner;
//String serviceName, int areaUse, int price, int peopleMax, String date, String standardsRoomHouse, int numberOfFloorsHouse

public class ServiceHouse {
    public static void addHouse() {
        LinkedHashMap<House, Integer> houseIntegerLinkedHashMap = ReadHouse.readHouse("src/case_study/data/dataHouse.csv");
        Scanner sc = new Scanner(System.in);
        String id = null;
        do {
            System.out.println("Nhập id");
             id = sc.nextLine();
             if (FormatIdFacility.regexHouse(id)){
                 break;
             }
        }while (true);

        String name = "House";
        System.out.println("Nhập diện tích sử dụng");
        int areaUse = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số người");
        int peopleMax = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập thời gian thuê");
        String date = sc.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String standardsRoom = sc.nextLine();
        System.out.println("Nhập số tầng:");
        int numberOfFloorsVilla = Integer.parseInt(sc.nextLine());
        House house = new House(id,name, areaUse, price, peopleMax, date, standardsRoom, numberOfFloorsVilla);
        houseIntegerLinkedHashMap.put(house, 0);
        WriteHouse.writeHouse("src/case_study/data/dataHouse.csv", houseIntegerLinkedHashMap);
    }
}
