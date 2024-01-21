package Generics;

public class SwapElements<T> {

    private T[] array;

    public SwapElements(T[] array) {
        this.array = array;
    }

    public T[] getArray () {

        return array;
    }
    public static <T> T[] swap (T[] array, int index1, int index2) {

        for (int i = 0; i < array.length; i++) {
            T temp;
            temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
        return array;
    }



    public static void main(String[] args) {
        int [] integerTest = {2,4,5,6,7,8};
      //  SwapElements <Integer> integerSwapElements  = new SwapElements<>(integerTest);
      // swap(integerTest, 0,3);
      //  System.out.println(Arrays.toString(intgerTest));


    }



}
