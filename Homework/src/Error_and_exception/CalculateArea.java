package Error_and_exception;

public class CalculateArea {
    public static void main(String[] args)  {
        double[] circle = {-3};
        double[] rectangle = {1.5,-2};
        double[] triangle = {2,2,245};
        double[] incorrect = {1.5,2,4,5};

         // Используем блок try-catch по сколько это основной способ обработки исключений в Java
        // Если использовать только один блок try-catch для всех вычислений,
        // то после первой найденной исключением он остановится
       try {
           // блок кода, который может вызвать исключение в вычисления площадь круга
           calculateArea(circle);
       } catch (IncorrectFigureSizeException e) {
           System.out.println(e.getMessage());
       }
        try {
            // блок кода, который может вызвать исключение в вычисления площадь прямоугольника
            calculateArea(rectangle);
        } catch (IncorrectFigureSizeException e) {
            System.out.println(e.getMessage());
        }
        try {
            // блок кода, который может вызвать исключение в вычисления площадь треугольника
            calculateArea(triangle);
        } catch (IncorrectFigureSizeException e) {
            System.out.println(e.getMessage());
        }
        try {
            // блок кода, который может вызвать исключение в существование геометрической фигуры с таким номером сторон
            calculateArea(incorrect);
        } catch (IncorrectFigureSizeException e) {
            System.out.println(e.getMessage());
        }
    }

        //Этот метод определяет длину массива для каждой геометрической фигуры и
       // определяет по какому методу мы будем вычислять площадь каждой фигуры
       // Используем throws по сколько метод выбросит исключение IncorrectFigureSizeException
    public static void calculateArea(double []sizes) throws IncorrectFigureSizeException {
        if (sizes.length == 1) {
            circleArea (sizes[0]);
        }else if (sizes.length == 2) {
            rectangleArea (sizes[0],sizes[1]);
        }else if (sizes.length == 3) {
            triangleArea (sizes[0],sizes[1],sizes[2]);
        } else {
            //  throw, что бы сгенерировать новое исключение (exception1) IncorrectFigureSizeException
            //  для несуществующей в коде геометрической фигуры с таким номером сторон
            IncorrectFigureSizeException exception1 = new IncorrectFigureSizeException("Некорректный ввод");
            throw exception1;
        }
    }

      // Этот метод вычисляет площадь круга
      // Используем  throws по сколько метод выбросит исключение IncorrectFigureSizeException
    public static void circleArea(double rad) throws IncorrectFigureSizeException {
        if (rad > 0) {
            System.out.printf("Площадь круга будет равна %.2f", Math.PI * Math.pow(rad, 2));
            System.out.println();
        } else {
            //  throw, что бы сгенерировать новое исключение (exception2) IncorrectFigureSizeException для круга
            IncorrectFigureSizeException exception2 = new IncorrectFigureSizeException("Круг с введенным радиусом не существует");
            throw exception2;
        }
    }
    // Этот метод вычисляет площадь прямоугольника
    // Используем  throws по сколько метод выбросит исключение IncorrectFigureSizeException
    public static void rectangleArea(double size1, double size2) throws IncorrectFigureSizeException {
        if (size1 > 0 && size2 > 0) {
            System.out.println("Площадь прямоугольника равна " + size1 * size2);
        } else {
            //  throw, что бы сгенерировать новое исключение (exception3) IncorrectFigureSizeException для прямоугольника
            IncorrectFigureSizeException exception3 = new IncorrectFigureSizeException("Прямоугольник не существует");
            throw exception3;
        }

    }

    // Этот метод вычисляет площадь треугольника по формуле Герона
    // Используем  throws по сколько метод выбросит исключение IncorrectFigureSizeException
    public static void triangleArea(double size1, double size2, double size3) throws IncorrectFigureSizeException {
        //сначала проверяем существования треугольника
        if ((size1 > 0 && size2 > 0 && size3 > 0) && (size1 < size2 + size3) && (size2 < size1 + size3) &&
                (size3 < size1 + size2)) {
            double pp = (size1 + size2 + size3) / 2;
            double triangleArea = Math.sqrt(pp * (pp - size1) * (pp - size2) * (pp - size3));
            System.out.printf("Площадь треугольника равна %.2f", triangleArea);
            System.out.println();
        }else {
            //  throw, что бы сгенерировать новое исключение (exception3) IncorrectFigureSizeException для треугольника
            IncorrectFigureSizeException exception4 = new IncorrectFigureSizeException("Треугольник с введенными сторонами не существует");
            throw exception4;
        }
    }
}
