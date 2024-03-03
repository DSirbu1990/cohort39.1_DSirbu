package Multithreading;

public class Priority {
    /**
     * Задача 1: Имена потоков и приоритеты
     * Описание
     * Создайте несколько потоков (не менее трех), присвойте им осмысленные имена и различные приоритеты.
     * Реализуйте в этих потоках бесконечные циклы, в которых потоки выводят свое имя и приоритет.
     * Пример вывода
     * Thread-1, Priority: 5 Thread-2, Priority: 3 Thread-3, Priority: 8
     */

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Thread-1");
                Thread.currentThread().setPriority(5);
                while(true) {
                    System.out.println(Thread.currentThread().getName() + " ,Priority: " +
                            Thread.currentThread().getPriority());
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Thread-2");
                Thread.currentThread().setPriority(3);
                while (true) {
                    System.out.println(Thread.currentThread().getName() + " ,Priority: " +
                            Thread.currentThread().getPriority());
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Thread-3");
                Thread.currentThread().setPriority(8);
                while(true) {
                    System.out.println(Thread.currentThread().getName() + " ,Priority: " +
                            Thread.currentThread().getPriority());
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
