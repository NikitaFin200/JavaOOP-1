import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Shapes[] shape = new Shapes[]{
                new Square(10, "Square 1"),
                new Square(15, "Square 2"),
                new Triangle(1, 1, 4, 4, 7, 2, "Triangle 3"),
                new Triangle(2, 4, 7, 9, 11, 1, "Triangle 4"),
                new Rectangle(10, 20, "Rectangle 5"),
                new Rectangle(31, 20, "Rectangle 6"),
                new Circle(10, "Circle 7"),
                new Circle(12, "Circle 8"),
                new Circle(19, "Circle 9"),
                new Square(21, "Square last")
        };

        Arrays.sort(shape, ShapesNameComparator);
        System.out.println(Arrays.toString(shape));
    }

    public static double compareToo(Shapes compareShapes) {

        return compareShapes.getArea();
    }

    public static Comparator<Shapes> ShapesNameComparator = (o1, o2) -> {
        String shapesName1 = o1.getName();
        String shapesName2 = o2.getName();

        return shapesName1.compareTo(shapesName2);
    };
}
