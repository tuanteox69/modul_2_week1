package fruit;

public class Orange extends Fruit {

    public Orange() {
    }

    public Orange(String color) {
        setColor(color);
    }


    @Override
    public String howToEat() {
        return "juiced it";
    }
}