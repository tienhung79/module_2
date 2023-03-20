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
    public static void addVilla() {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<Villa, Integer> villaLinkedHashMap = ReadVilla.readVilla("src/case_study/data/dataVilla.csv");
        String id;
        do {
            System.out.println("Nhập id");
            id = sc.nextLine();
            if (FormatIdFacility.regexVilla(id)) {
                break;
            }
            System.out.println("Yêu cầu nhập đúng format ");
        } while (true);
        String name;
        do {
            System.out.println("Yêu cầu nhập tên");
            name = sc.nextLine();
            if (FormatNameFacility.formatNameFacilityVilla(name)) {
                break;
            }
        } while (true);
        int areaUse;
        do {
            System.out.println("Nhập diện tích sử dụng");
            System.out.println("Diện tích sử dụng phải lớn hơn 30");
            areaUse = Integer.parseInt(sc.nextLine());
        } while (areaUse < 30);
        int price;
        do {
            System.out.println("Nhập giá ");
            System.out.println("Chi phí thuê phải lớn hơn 0");
            price = Integer.parseInt(sc.nextLine());
        } while (price < 0);
        int peopleMax;
        do {
            System.out.println("Nhập số người");
            System.out.println("Số người phải lớn hơn 0 và nhỏ hơn 20");
            peopleMax = Integer.parseInt(sc.nextLine());
        } while (peopleMax < 0 || peopleMax > 20);
        System.out.println("Nhập thời gian thuê");
        String date = sc.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng");
        String standardsRoom = sc.nextLine();
        int areaSwimpool;
        do {
            System.out.println("Nhập diện tích hồ bơi");
            System.out.println("Diện tích hồ bơi phải lớn hơn 30");
             areaSwimpool = Integer.parseInt(sc.nextLine());
        }while (areaSwimpool<30);
        int numberOfFloorsVilla;
        do {
            System.out.println("Nhập số tầng:");
            System.out.println("Số tầng phải lớn hơn 0");
             numberOfFloorsVilla = Integer.parseInt(sc.nextLine());
        }while (numberOfFloorsVilla<0);
        Villa villa = new Villa(id, name, areaUse, price, peopleMax, date, standardsRoom, areaSwimpool, numberOfFloorsVilla);
        villaLinkedHashMap.put(villa, 0);
        WriteVilla.writeVilla("src/case_study/data/dataVilla.csv", villaLinkedHashMap);
    }

}
