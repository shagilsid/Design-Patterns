package factory;

import Production.ConcreteProduct;
import Production.IProduct;

public class ConcreteProductCreator2 implements IProductCreator {
    @Override
    public IProduct createProduct() {
        //have another logic for creating an object;
        IProduct product2=new ConcreteProduct();
        return product2;
    }
}
