package ss17_io_binaryFile_serialization.product.cotrolle;

import ss17_io_binaryFile_serialization.product.service.IService;
import ss17_io_binaryFile_serialization.product.service.Service;

import java.util.Scanner;

public class MenuController {
  IService iService = new Service();
  public void menuProduct(){
      Scanner sc = new Scanner(System.in);
      String choice;
      do {
          System.out.println("Vui lòng chọn chức năng:");
          System.out.println("1: Thêm sản phẩm");
          System.out.println("2: Hiển thị sản phẩm");
          System.out.println("3: Tìm kiếm sản phẩm");
          choice = sc.nextLine();
          switch (choice){
              case "1":
                  iService.add();
                  break;
              case "2":
                  iService.disPlay();
                  break;
              case "3":
                  iService.find();
                  break;
              case "4":
                  break;
          }
      }while (!choice.equals("4"));


  }
}
