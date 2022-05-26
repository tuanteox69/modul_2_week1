import shape.*;

public class tester {
    public static void main(String[] args) {
        Shape[] shape = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shape[i] = getRandomShape();
        }
        Shape.printShape(shape);
        for (Shape x: shape){
            x.resize(Math.random()*100);
        }
        System.out.println("\n");
        Shape.printShape(shape);
    }

    static Shape getRandomShape() {
        int radom = (int) (Math.round(Math.random() * 2));
        switch (radom) {
            case 0:
                return new Square(10);
            case 1:
                return new Rectangle(10, 20);
            default:
                return new Circle(10);
        }
    }

}