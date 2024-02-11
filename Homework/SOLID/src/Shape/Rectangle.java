package Shape;
/*
Используйте интерфейс Shape для создания класса Rectangle
 */
public class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height; // Calculate area of Rectangle
    }

}
