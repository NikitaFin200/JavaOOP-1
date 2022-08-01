public class Rectangle implements Shapes {
    private final double length1, length2;

    private String name;

    public Rectangle(double length1, double length2, String name) {
        this.length1 = length1;
        this.length2 = length2;
        this.name = name;
    }

    @Override
    public double getWidth() {
        return length2;
    }

    @Override
    public double getHeight() {
        return length1;
    }

    @Override
    public double getArea() {
        return length1 * length2;
    }

    @Override
    public double getPerimeter() {
        return 2 * length1;
    }

    public double getLength1() {
        return length1;
    }

    public double getLength2() {
        return length2;
    }

    public String getName() {
        return name;
    }
}
