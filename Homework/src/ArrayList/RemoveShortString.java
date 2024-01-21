package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveShortString {

    /** Создайте ArrayList, содержащий строки. Напишите метод removeShortString(int size) для удаления всех строк,
     *  которые короче определенной длины. Реализуйте функционал для перевода всех строк в верхний регистр.
     */
    public static void main(String[] args) {

        //Создаю ArrayList, содержащий строки
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("one");
        stringArrayList.add("two");
        stringArrayList.add("three");
        stringArrayList.add("four");
        stringArrayList.add("five");
        stringArrayList.add("six");
        stringArrayList.add("seven");
        stringArrayList.add("eight");
        stringArrayList.add("nine");
        stringArrayList.add("ten");

        //Использую метод removeShortString, чтобы удалить строки имеющие длину 3
        removeShortString(stringArrayList,3);
        printArray(stringArrayList);

        toUpperCase(stringArrayList);

    }

    //метод для удаления всех строк,которые короче определенной длины
  static void removeShortString (ArrayList list, int size) {

        Iterator<String> iterator = list.iterator();//создаем итератор
        while (iterator.hasNext()) {//до тех пор, пока в списке есть элементы
            String nextString = iterator.next();//получаем следующий элемент
            if (nextString.length()<= size) {
                iterator.remove();// удаляем нужную строку
            }
        }
    }

    //метод для перевода всех строк в верхний регистр.
    static void toUpperCase (ArrayList list) {

        Iterator<String> iterator = list.iterator();//создаем итератор
        while (iterator.hasNext()) {//до тех пор, пока в списке есть элементы
            String nextString = iterator.next();
            String upperStr = nextString.toUpperCase();
            System.out.println(upperStr);
        }
    }

    // метод для
    static void printArray (ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}
