package ss17_io_binaryFile_serialization.product.repository;

import ss17_io_binaryFile_serialization.product.common.ReadFile;
import ss17_io_binaryFile_serialization.product.common.WriteFile;
import ss17_io_binaryFile_serialization.product.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Repository implements IRepository{
    private static List<Product> productList = new ArrayList<>();
    @Override
    public List<Product> getAll() {
        return ReadFile.read("src/ss17_io_binaryFile_serialization/product/data/data2.txt");
    }

    @Override
    public void add(List<Product> list) {
        WriteFile.writeFile("src/ss17_io_binaryFile_serialization/product/data/data2.txt",list);
    }

    @Override
    public boolean findProduct(String searchName) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(searchName)) {
                return true;
            }
        }
        System.out.println("Không có tên");
        return false;
    }


}
