public class Main {
    public static void main(String[] args) {
        //adding a caramel decorator around espresso beverage
        Beverage coffee=new Caramel(new Espresso());
        //adding a chocolate decorator around caramel decorator
        coffee=new Chocolate(coffee);
        System.out.println(coffee.getCost());

    }

}
