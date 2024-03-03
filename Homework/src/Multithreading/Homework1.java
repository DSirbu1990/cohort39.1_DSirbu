package Multithreading;

import java.io.FileInputStream;
import java.io.IOException;

public class Homework1 {

    /**
     *Задача: Параллельное считывание из двух файлов
     * Напишите программу, которая параллельно считывает данные из двух файлов и выводит их на экран.
     * Пример
     * Входные данные (в файле 1): Hello, World!
     * Входные данные (в файле 2): How are you?
     * Выходные данные: Hello, World! How are you?
     */
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
          String file1Path = "/Users/doinasirbu/Documents/java project/cohort39.1_DSirbu/Homework/src/Multithreading/File1";
            try (FileInputStream fis = new FileInputStream(file1Path)) {
                int i;
                System.out.print(" ");
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            String file2Path = "/Users/doinasirbu/Documents/java project/cohort39.1_DSirbu/Homework/src/Multithreading/File2";
            try (FileInputStream fis = new FileInputStream(file2Path)) {
                int i;
                System.out.print(" ");
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });

        thread1.start();
        thread1.join();
        thread2.start();
    }

}
