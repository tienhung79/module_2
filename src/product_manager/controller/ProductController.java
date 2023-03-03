package product_manager.controller;

import product_manager.service.imp.IProductService;
import product_manager.service.imp.ProductService;

import java.util.Scanner;

public class ProductController {
    IProductService productService = new ProductService();
    Scanner sc = new Scanner(System.in);
    public void menuProduct(){
        String choice;
        do {
            System.out.println("1:thêm sản phẩm:");
            System.out.println("2:Sửa thông tin theo id:");
            System.out.println("3: Xóa sản phẩn theo id");
            System.out.println("4: Hiển thị sản phẩm theo id:");
            System.out.println("5: Tìm kiếm sản phẩm theo id:");
            System.out.println("6: Sắp xếp sản phẩm theo giá:");
            System.out.println("7: thoát");
            choice = sc.nextLine();
            switch (choice){
                case "1":
                    productService.addProduct();
                    break;
                case "2":
                    productService.repairProduct();
                    break;
                case "3":
                    productService.deleteProduct();
                    break;
                case "4":
                    productService.disPlay();
                    break;
                case "5":
                    productService.disPlayProduct();
                    break;
                case "6":
                    productService.docking();
                    break;
                case "7":
                    System.out.println("đã dừng hoạt động");
                    break;
            }
        }while (!choice.equals("7"));
    }

}
