package product_manager.reposirtory;

import product_manager.model.Produce;

import java.util.List;

public interface IProductReopository {
    void add(Produce produce);

    void delete(int i);


    List<Produce> getALL();


    void repairn(int i ,Produce produce);


    void disPlayProduct(int i);

    void disPlay(int i);


}
