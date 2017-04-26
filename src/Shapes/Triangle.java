package Shapes;

public class Triangle extends Shapes {

    private double side;
    String style;

    public Triangle(double s, String st) {
        super("Треугольник");
        side = s;
        style = st;
    }


    double area() {
        return Math.sqrt(3.0)/4*side*side;
    }

    public void drawShape() {
        System.out.println(getName() +" "+ style + " c стороной в " + side + " м. Имеет площадь в " + area()+" кв.м.");

    }
}
