package Improv;

public class DuckDemo {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck(
                () -> "I quack",
                () -> "I fly",
                () -> "I look like mallard duck",
                () -> "I do not know swimming"
        );

        System.out.println(mallardDuck.fly());
        System.out.println(mallardDuck.quack());
        mallardDuck.setQuackBehavior(() -> "new quack");
        System.out.println(mallardDuck.quack());
    }
}
