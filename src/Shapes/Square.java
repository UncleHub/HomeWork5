package Shapes;

public class Square extends Shapes {

    private double side;
    String style;

    public Square(double s, String st) {
        super("Kвадрат");
        side = s;
        style = st;
    }


    double area() {
        return side * side;
    }

    public void drawShape() {
        System.out.println(getName() +" "+ style + " c стороной в " + side + " м. Имеет площадь в " + area()+" кв.м.");

    }
}
