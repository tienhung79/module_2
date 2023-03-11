package product_manager.service.imp;

import product_manager.model.Produce;
import product_manager.reposirtory.IProductReopository;
import product_manager.reposirtory.imp.ProductRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    IProductReopository productReopository = new ProductRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm:");
        String nameProduct = sc.nextLine();
        System.out.println("Nhập giá của sản phẩm:");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Thêm thành công");
        Produce produce = new Produce(id, nameProduct, price);
        productReopository.add(produce);
    }

    @Override
    public boolean disPlay() {
        List<Produce> list = productReopository.getALL();
        if (list.size() == 0) {
            System.out.println("không có danh sách");
        } else {
            System.out.println("Nhập id muốn tìm:");
            int id = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    productReopository.disPlay(i);
                }
            }return true;
        }
        System.out.println("Không tìm thấy id muốn tìm");
        return false;
    }

    @Override
    public void repairProduct() {
        List<Produce> list = productReopository.getALL();
        System.out.println("Nhập id của sản phẩm muốn sữa:");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println("Nhập tên sản phẩm");
                String name = sc.nextLine();
                System.out.println("Nhập giá ");
                int price = Integer.parseInt(sc.nextLine());
                Produce produce = new Produce(id, name, price);
                productReopository.repairn(i, produce);
                System.out.println("Sửa thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

    @Override
    public void deleteProduct() {
        List<Produce> list = productReopository.getALL();
        System.out.println("Nhập id muốn xóa:");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println("Bạn có muốn xóa không:");
                System.out.println("1:có");
                System.out.println("2:Không");
                String decide = sc.nextLine();
                if (decide.equals("có")) {
                    productReopository.delete(i);
                    System.out.println("xóa thành công");
                    return;
                }
            }
        }
        System.out.println("không có id để xóa ");
    }

    @Override
    public boolean disPlayProduct() {
        List<Produce> list = productReopository.getALL();
        if (list.size() == 0) {
            System.out.println("không có sản phẩm");
        } else {
            System.out.println("Nhập id muốn tìm:");
            int id = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id) {
                    System.out.println();
                    productReopository.disPlayProduct(i);
                }
            }return true;
        }
        System.out.println("không tìm thấy");
        return false;
    }

    @Override
    public void docking() {
        List<Produce> list = productReopository.getALL();
        String choice;
        do {
            System.out.println("Bạn muốn xếp tăng dần hay giảm dần:");
            System.out.println("1: Giảm dần");
            System.out.println("2: Tăng dần");
            System.out.println("3: Hủy sắp xếp");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    Collections.sort(list, new Comparator<Produce>() {
                        @Override
                        public int compare(Produce o1, Produce o2) {
                            return o1.getPrice() - o2.getPrice();
                        }
                    });
                    for (Produce temp : list
                    ) {
                        System.out.println(temp);
                    }
                    System.out.println("đã sắp xếp xong");
                    break;
                case "2":
                    Collections.sort(list, new Comparator<Produce>() {
                        @Override
                        public int compare(Produce o1, Produce o2) {
                            return o2.getPrice() - o1.getPrice();
                        }
                    });
                    for (Produce temp : list
                    ) {
                        System.out.println(temp);
                    }
                    System.out.println("đã sắp xếp xong");
                    break;
                case "3":
                    System.out.println("đã hủy");
                    break;

            }
        } while (!choice.equals("3"));
    }
}
