package fruit;

public class Apple extends Fruit {
    public Apple() {
    }

    public Apple(String color) {
        setColor(color);
    }

    @Override
    public String howToEat() {
        return "cut in half";
    }
}