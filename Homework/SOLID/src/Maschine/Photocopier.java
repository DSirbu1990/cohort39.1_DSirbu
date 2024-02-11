package Maschine;
/*
Создать интерфейс Machine с методами print(), fax() и scan().
Реализуйте классы Printer и Photocopier, которые имплементируют только необходимые методы
 */

/**
 * Photocopier факс не использует, поэтому имплементируем только IMaschine
 */
public class Photocopier implements IMaschine{
    @Override
    public void print() {

    }

    @Override
    public void scan() {

    }
}
