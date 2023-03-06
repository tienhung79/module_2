package product_manager.reposirtory.imp;

import product_manager.model.Produce;
import product_manager.reposirtory.IProductReopository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductReopository {
    Produce produce =new Produce();
    public static List<Produce> produceList= new ArrayList<>();
    static {
        produceList.add(new Produce(123,"xe",34000));
        produceList.add(new Produce(456,"xe dap",26000));
        produceList.add(new Produce(789,"xe may",89000));
        produceList.add(new Produce(789,"o to",89000));
    }




    @Override
    public void add(Produce produce) {
        produceList.add(produce);
    }
    @Override
    public void delete(int i) {
        produceList.remove(i);
    }

    @Override
    public List<Produce> getALL() {
        return produceList;
    }

    @Override
    public void repairn(int i ,Produce produce) {
        produceList.set(i,produce);
    }

    @Override
    public void disPlayProduct(int i) {
        System.out.println( produceList.get(i).getNameProduct());
    }

    @Override
    public void disPlay(int i) {
        System.out.println(produceList.get(i));
    }
}
