package Error_and_exception;

public class CalculateArea {

    /**
     * Реализуйте метод calculateArea, который принимает массив чисел типа double -
     * размеры сторон фигуры и возвращает значение, представляющее площадь фигуры.
     Круг (Длина массива = 1): Вычислить площадь круга.
     Прямоугольник (Длина массива = 2): Вычислить площадь прямоугольника.
     Треугольник (Длина массива = 3): Вычислить площадь треугольника по формуле Герона.
     Допишите код, создав свой собственный класс IncorrectFigureSizeException,
     который будет выброшен в случае, если ввели некорректные значения для сторон.
     */
    public static void main(String[] args)  {
        double[] circle = {3};
        double[] rectangle = {1.5,2};
        double[] triangle = {4,2,3};

         // Используем блок try-catch по сколько это основной способ обработки исключений в Java
        // Если использовать только один блок try-catch для всех вычислений,
        // то после первой найденной исключением он остановится
       try {
           // блок кода, который может вызвать исключение в вычисления площадь круга
          circleArea(circle);
       } catch (IncorrectFigureSizeException e) {
           System.out.println(e.getMessage());
       }
        try {
            // блок кода, который может вызвать исключение в вычисления площадь прямоугольника
            rectangleArea(rectangle);
        } catch (IncorrectFigureSizeException e) {
            System.out.println(e.getMessage());
        }
        try {
            // блок кода, который может вызвать исключение в вычисления площадь треугольника
            triangleArea(triangle);
        } catch (IncorrectFigureSizeException e) {
            System.out.println(e.getMessage());
        }
    }


      // Этот метод вычисляет площадь круга
      // Используем  throws по сколько метод выбросит исключение IncorrectFigureSizeException
    public static double circleArea(double []circle) throws IncorrectFigureSizeException {

        if (circle.length == 1 && circle[0] > 0) {
            double cArea = Math.PI * Math.pow(circle[0], 2);
            System.out.println("Площадь круга будет равна " + cArea);
        } else {
            //  throw, что бы сгенерировать новое исключение (circleException) IncorrectFigureSizeException для круга
            IncorrectFigureSizeException circleException = new IncorrectFigureSizeException("Круг с введенным радиусом не существует");
            throw circleException;
        }
        return 0;
    }
    // Этот метод вычисляет площадь прямоугольника
    // Используем  throws по сколько метод выбросит исключение IncorrectFigureSizeException
    public static void rectangleArea(double [] rect) throws IncorrectFigureSizeException {
        if (rect.length == 2 && rect[0] > 0 && rect[1] > 0) {
            double rArea = rect[0] * rect[1];
            System.out.println("Площадь прямоугольника равна " + rArea);
        } else {
            //  throw, что бы сгенерировать новое исключение (rectangleException) IncorrectFigureSizeException для прямоугольника
            IncorrectFigureSizeException rectangleException = new IncorrectFigureSizeException("Прямоугольник не существует");
            throw rectangleException;
        }

    }

    // Этот метод вычисляет площадь треугольника по формуле Герона
    // Используем  throws по сколько метод выбросит исключение IncorrectFigureSizeException
    public static void triangleArea(double []triangle) throws IncorrectFigureSizeException {
        //сначала проверяем существования треугольника
        if (triangle.length == 3 && (triangle[0] > 0 && triangle[1] > 0 && triangle[2]> 0) && (triangle[0] < triangle[1] + triangle[2]) && (triangle[1] < triangle[0] + triangle[2]) &&
                (triangle[2] < triangle[0] + triangle[1])) {
            double pp = (triangle[0] + triangle[1] + triangle[2]) / 2;
            double triangleArea = Math.sqrt(pp * (pp - triangle[0]) * (pp - triangle[1]) * (pp - triangle[2]));
            System.out.println("Площадь треугольника равна " + triangleArea);
        }else {
            //  throw, что бы сгенерировать новое исключение (triangleException) IncorrectFigureSizeException для треугольника
            IncorrectFigureSizeException triangleException = new IncorrectFigureSizeException("Треугольник с введенными сторонами не существует");
            throw triangleException;
        }
    }
}
