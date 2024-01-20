package Generics;

import java.util.Arrays;

public class SwapElements<T> {

    private T[] array;

    public void set (T[] array) {

        this.array = array;
    }

    public T[] getArray () {
        return array;
    }
    public static <T> void swap (T[] array, int index1, int index2) {
        for (int i = 0; i < array.length ; i++) {
            T temp;
            temp = array [index1];
            array [index1] = array [index2];
            array [index2] = temp;
        }
    }

    public static void main(String[] args) {
        String [] test = {"B", "D", "A"};
        swap(test, 0,2 );
        System.out.println(Arrays.toString(test));

    }

}
