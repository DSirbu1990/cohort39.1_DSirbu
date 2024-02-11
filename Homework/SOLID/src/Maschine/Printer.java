package Maschine;
/*
Создать интерфейс Machine с методами print(), fax() и scan().
Реализуйте классы Printer и Photocopier, которые имплементируют только необходимые методы
 */

/**
 * Для принтера нам нужны все методы , поэтому имплементируем оба интерфейса
 */
public class Printer implements IMaschine,IFax{
    @Override
    public void fax() {

    }

    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }
}
