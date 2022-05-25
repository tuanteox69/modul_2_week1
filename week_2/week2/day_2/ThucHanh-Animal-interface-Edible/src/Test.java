import fruit.*;
import animal.*;

public class Test {
    public static void main(String[] args) {
        Fruit fruit = new Apple("red");
        System.out.println(fruit.getColor());
        System.out.println(fruit.howToEat());
        fruit = new Orange();
        System.out.println(fruit.getColor());
        System.out.println(fruit.howToEat());

        Animal chick = new Chicken();
        System.out.println(((Chicken) chick).howToEat());

    }
}