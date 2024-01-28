package Generics;

import java.util.Arrays;

public class SwapElements<T> {
    /**Разработайте статический обобщенный метод swap, который принимает массив любого типа и два индекса,
     * и обменивает местами элементы по этим индексам.
     */
    public static void main(String[] args) {
        //создаю массив типа Integer
        Integer [] integerTest = {2,4,5,6,7,8};
        swap(integerTest,0,3);
        System.out.println(Arrays.toString(integerTest));

        //создаю массив типа Double
        Double [] doubleTest = {3.5,6.5,4.2,3.4};
        swap(doubleTest,0,1);
        System.out.println(Arrays.toString(doubleTest));

        //создаю массив типа String
        String [] stringTest = {"A","C","B"};
        swap(stringTest,1,2);
        System.out.println(Arrays.toString(stringTest));

    }

    //статический обобщенный метод swap, создаю с помощью дженериков
    //этот метод принимает массив любого типа и два индекса
    public static <T> T[] swap (T[] array, int index1, int index2) {
            T temp;
            temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;

        return array;
    }

}
