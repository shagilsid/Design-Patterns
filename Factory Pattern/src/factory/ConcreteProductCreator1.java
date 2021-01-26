package factory;

import Production.ConcreteProduct;
import Production.IProduct;

public class ConcreteProductCreator1 implements IProductCreator {

    @Override
    public IProduct createProduct() {
        //have some logic to create an object of Product
        IProduct product=new ConcreteProduct();
        return product;
    }
}
