package Shapes;


public class Doo {

    public static void main(String[] args) {

        Shapes a1 = new Square(5.6, "заштрихованный");
        Shapes a2 = new Triangle(2.8, "синий");
        Shapes a3 = new Circle(3.8, "в фиолетовую крапинку");
        a1.drawShape();
        a2.drawShape();
        a3.drawShape();

    }
}
