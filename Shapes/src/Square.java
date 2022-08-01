public class Square implements Shapes {

    private final String name;
    private final double length;

    public Square(double length, String name) {
        this.length = length;
        this.name = name;
    }

    @Override
    public double getWidth() {
        return length;
    }

    @Override
    public double getHeight() {
        return length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    public double getX() {
        return length;
    }

    public String getName() {
        return name;
    }
}
