package Maschine;
/*
Создать интерфейс Machine с методами print(), fax() и scan().
Реализуйте классы Printer и Photocopier, которые имплементируют только необходимые методы
 */
/**
 * Поскольку мы тут должны использовать принцип разделения интерфейса я разделила наш интерфейс на два
 * IMaschine и IFax
 */

public interface IFax {

    void fax();
}
