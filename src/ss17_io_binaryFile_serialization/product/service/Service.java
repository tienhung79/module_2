package ss17_io_binaryFile_serialization.product.service;

import ss17_io_binaryFile_serialization.product.common.ReadFile;
import ss17_io_binaryFile_serialization.product.model.Product;
import ss17_io_binaryFile_serialization.product.repository.IRepository;
import ss17_io_binaryFile_serialization.product.repository.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service implements  IService{
    IRepository iRepository=new Repository();
    @Override
    public void disPlay() {
        List<Product> list = iRepository.getAll();
        for (Product temp : list
             ) {
            System.out.println(temp);
        }
    }

    @Override
    public void add() {
        List<Product> list = iRepository.getAll();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm:");
        String name = sc.nextLine();
        System.out.println("Nhập giá:");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập hàng sản xuất:");
        String producer = sc.nextLine();
        System.out.println("Mô tả sản phẩm:");
        String descrip = sc.nextLine();
        Product product = new Product(id,name,price,producer,descrip);
        list.add(product);
        iRepository.add(list);
    }

    @Override
    public void find() {
        Scanner sc = new Scanner(System.in);
        List<Product> productList = iRepository.getAll();
        String name = sc.nextLine();
        boolean findname = iRepository.findProduct(name);
        if (findname){
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getName().equals(name)){
                    System.out.println(productList.get(i));
                }

            }
        }
    }


}
