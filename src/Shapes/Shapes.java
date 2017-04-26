package Shapes;

public abstract class Shapes {

    private String name;

    public Shapes(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    abstract void drawShape();
    abstract double area();
}
