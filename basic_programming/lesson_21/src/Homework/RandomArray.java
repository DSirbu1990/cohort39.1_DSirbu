package Homework;
import java.util.Random;
public class RandomArray {
public static void main(String[] args) {
    Random random = new Random();
    int[] array = new int[1000000];
    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(1000) + 1;
    }
}

    }


