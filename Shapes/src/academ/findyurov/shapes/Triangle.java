package academ.findyurov.shapes;

import academ.findyurov.shapes.Shapes;

public class Triangle implements Shapes {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    private final String name;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3, String name) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.name = name;
    }

    double abLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    double bcLength = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    double caLength = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
    double p = (abLength + bcLength + caLength) / 2;

    @Override
    public double getWidth() {
        return getArea() / bcLength;
    }

    @Override
    public double getHeight() {
        return (2 / bcLength) * Math.sqrt(p * (p - abLength) * (p - bcLength) * (p - caLength));
    }

    @Override
    public double getArea() {
        return 0.5 * bcLength * getHeight();
    }

    @Override
    public double getPerimeter() {
        return abLength + bcLength + caLength;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public double getX3() {
        return x3;
    }

    public double getY3() {
        return y3;
    }

    public String name() {
        return name;
    }

    public boolean equals(Object o) {//переопределение метода equals
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Shapes e = (Shapes) o;
        return (this.getHeight() == e.getHeight());
    }

    public int hashCode()                                             //переопределение метода hashCode
    {
        final int PRIME = 31;
        double result = 1;
        result = PRIME * result + getPerimeter();
        return (int) result;
    }
}

