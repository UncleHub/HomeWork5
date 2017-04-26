package Shapes;

public class Circle extends Shapes {

    private double side;
    String style;

    public Circle(double s,String st) {
        super("Круг");
        side = s;
        style = st;
    }
    double area() {
        return Math.PI*side * side;
    }

    public void drawShape() {
        System.out.println(getName() +" "+ style + " c радиусом в " + side + " м. Имеет площадь в " + area()+" кв.м.");

    }


}
