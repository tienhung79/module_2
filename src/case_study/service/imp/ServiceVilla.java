package case_study.service.imp;

import case_study.common.read.ReadVilla;
import case_study.common.write.WriteVilla;
import case_study.format.FormatIdFacility;
import case_study.format.FormatNameFacility;
import case_study.model.Villa;

import javax.xml.soap.SAAJResult;
import java.util.LinkedHashMap;
import java.util.Scanner;
//String serviceName, int areaUse, int price, int peopleMax, String date, String standardsRoom, int areaSwimPooll, int numberOfFloorsVilla

public class ServiceVilla {
    public static void addVilla(){
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Villa,Integer> villaLinkedHashMap = ReadVilla.readVilla("src/case_study/data/dataVilla.csv");
        String id ;
        do {
            System.out.println("Nhập id");
           id = sc.nextLine();
           if (FormatIdFacility.regexVilla(id)){
              break;
           }
            System.out.println("Yêu cầu nhập đúng format ");
        }while (true);
        String name;
        do {
            System.out.println("Yêu cầu nhập tên");
             name = sc.nextLine();
             if (FormatNameFacility.formatNameFacilityVilla(name)){
                 break;
             }
        }while (true);

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
        System.out.println("Nhập diện tích hồ bơi");
        int areaSwimpool= Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số tầng:");
        int numberOfFloorsVilla = Integer.parseInt(sc.nextLine());
        Villa villa = new Villa(id,name,areaUse,price,peopleMax,date,standardsRoom,areaSwimpool,numberOfFloorsVilla);
        villaLinkedHashMap.put(villa,0);
        WriteVilla.writeVilla("src/case_study/data/dataVilla.csv",villaLinkedHashMap);
    }

}
