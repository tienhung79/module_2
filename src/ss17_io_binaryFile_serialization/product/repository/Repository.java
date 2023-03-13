package ss17_io_binaryFile_serialization.product.repository;

import ss17_io_binaryFile_serialization.product.common.ReadFile;
import ss17_io_binaryFile_serialization.product.common.WriteFile;
import ss17_io_binaryFile_serialization.product.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Repository implements IRepository{
    private static List<Product> productList = ReadFile.read("src/ss17_io_binaryFile_serialization/product/data/data2.txt");
    @Override
    public List<Product> getAll() {
        return ReadFile.read("src/ss17_io_binaryFile_serialization/product/data/data2.txt");
    }

    @Override
    public void add(List<Product> list) {
        WriteFile.writeFile("src/ss17_io_binaryFile_serialization/product/data/data2.txt",list);
    }

    @Override
    public void displayProduct(int i) {
        System.out.println(productList.get(i));
    }


}
