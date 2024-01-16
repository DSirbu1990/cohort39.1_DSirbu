package Error_and_exception;
// данный класс, используется в качестве класса-предупреждения,
// когда пытаемся установить некорректное значение для сторон геометрических фигур
public class IncorrectFigureSizeException extends Exception{
    public IncorrectFigureSizeException(String message) {
        super (message);
    }
}
