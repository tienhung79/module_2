package ss17_io_binaryFile_serialization.product.repository;

import ss17_io_binaryFile_serialization.product.model.Product;

import java.util.List;

public interface IRepository {
    List<Product> getAll();


    void add(List<Product> list);

    boolean findProduct(String searchName);
}
