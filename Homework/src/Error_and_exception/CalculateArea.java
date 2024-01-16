package Error_and_exception;

public class CalculateArea {
    public static void main(String[] args)  {
        double[] circle = {3};
        double[] rectangle = {1.5,2};
        double[] triangle = {2,2,2};
        double[] incorrect = {1.5,2,4,5};


       try {
           calculateArea(circle);
           calculateArea(rectangle);
           calculateArea(triangle);
           calculateArea(incorrect);
       } catch (IncorrectFigureSizeException e) {
           System.out.println(e.getMessage());
       }
    }


    public static void calculateArea(double []sizes) throws IncorrectFigureSizeException {
        if (sizes.length == 1) {
            circleArea (sizes[0]);
        }else if (sizes.length == 2) {
            rectangleArea (sizes[0],sizes[1]);
        }else if (sizes.length == 3) {
            triangleArea (sizes[0],sizes[1],sizes[2]);
        } else {
            IncorrectFigureSizeException exception1 = new IncorrectFigureSizeException("Некорректный ввод");
            throw exception1;
        }
    }

    public static void circleArea(double rad) throws IncorrectFigureSizeException {
        if (rad > 0) {
            System.out.printf("Площадь круга будет равна %.2f", Math.PI * Math.pow(rad, 2));
            System.out.println();
        } else {
            IncorrectFigureSizeException exception2 = new IncorrectFigureSizeException("Круг с введенным радиусом не существует");
            throw exception2;
        }
    }

    public static void rectangleArea(double size1, double size2) throws IncorrectFigureSizeException {
        if (size1 > 0 && size2 > 0) {
            System.out.println("Площадь прямоугольника равна " + size1 * size2);
        } else {
            IncorrectFigureSizeException exception3 = new IncorrectFigureSizeException("Прямоугольник не существует");
            throw exception3;
        }

    }

    public static void triangleArea(double size1, double size2, double size3) throws IncorrectFigureSizeException {
        if ((size1 > 0 && size2 > 0 && size3 > 0) && (size1 < size2 + size3) && (size2 < size1 + size3) &&
                (size3 < size1 + size2)) {
            double pp = (size1 + size2 + size3) / 2;
            double triangleArea = Math.sqrt(pp * (pp - size1) * (pp - size2) * (pp - size3));
            System.out.printf("Площадь треугольника равна %.2f", triangleArea);
            System.out.println();
        }else {
            IncorrectFigureSizeException exception4 = new IncorrectFigureSizeException("Треугольник с введенными сторонами не существует");
            throw exception4;
        }
    }
}
