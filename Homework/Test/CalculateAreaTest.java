import Error_and_exception.CalculateArea;
import Error_and_exception.IncorrectFigureSizeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateAreaTest {
    @Test
    public void testCircleAreaErrorMessage () {

        double[] circle = {-3};
        String errorMessage = null;
        try {
            CalculateArea.circleArea(circle);
        } catch (IncorrectFigureSizeException e) {
            errorMessage = e.getMessage();
        }
        Assertions.assertNotNull(errorMessage);
        Assertions.assertEquals("Круг с введенным радиусом не существует", errorMessage);
    }
    @Test
    public void testRectangleAreaErrorMessage () {

        double[] rectangle = {1.5,-2};
        String errorMessage = null;
        try {
            CalculateArea.rectangleArea(rectangle);
        } catch (IncorrectFigureSizeException e) {
            errorMessage = e.getMessage();
        }
        Assertions.assertNotNull(errorMessage);
        Assertions.assertEquals("Прямоугольник с введенными сторонами не существует", errorMessage);
    }

    @Test
    public void testTriangleAreaErrorMessage () {

        double[] triangle = {4.5,6.4,90.2};
        String errorMessage = null;
        try {
            CalculateArea.triangleArea(triangle);
        } catch (IncorrectFigureSizeException e) {
            errorMessage = e.getMessage();
        }
        Assertions.assertNotNull(errorMessage);
        Assertions.assertEquals("Треугольник с введенными сторонами не существует", errorMessage);
    }
}

