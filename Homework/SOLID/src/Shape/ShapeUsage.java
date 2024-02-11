package Shape;

public class ShapeUsage {
 /*
 реализуйте функцию, которая принимает массив объектов типа Shape и вычисляет общую площадь
  */
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3,4);
        Double [] Shapes = {circle.calculateArea(), rectangle.calculateArea()};
        System.out.println(totalArea(Shapes));

    }

    public static double totalArea (Double[] Shapes){
        double area = 0;
        for (double i : Shapes) {
            area += i;
        }
        return area;
    }
}
