package LinkedList;
/**
 * Задание: Поиск k-го элемента с конца в односвязном списке
 * Цель: Реализовать метод для нахождения k-го элемента с конца в односвязном списке.
 * Задачи:
 * Реализовать метод findKthFromEnd в классе CustomLinkedList.
 * Метод должен находить элемент за один проход по списку.
 * Продемонстрировать работу метода на различных списках.
 * Односвязный список должен строиться на основе класса Node.
 */

public class CustomLinkedList {
    private Node head; // Начальный узел списка

    // Внутренний класс для узла списка
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Создаю метод для добавления элемента в список
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Создаю метод для нахождения k-го элемента с конца списка
    public int findKthFromEnd(int k) {
        Node fast = head;
        Node slow = head;

        // Создаю цикл for чтобы быстрый указатель двигался на k элементов вперед
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        // Перемещаю указатели до тех пор, пока fast не достигнет конца списка
        while (fast != null && fast.next != null ) {
            fast = fast.next;
            slow = slow.next;
        }

        //По сколько указатель slow медленнее чем fast он будет указывать на k-й элемент с конца
        return slow.data;
    }

    // Демонстрация работы
    public static void main(String[] args) {
        CustomLinkedList test = new CustomLinkedList();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        test.add(6);
        test.add(7);
        test.add(8);
        test.add(9);
        test.add(10);

        System.out.println(test.findKthFromEnd(0));
        System.out.println(test.findKthFromEnd(1));
        System.out.println(test.findKthFromEnd(2));
        System.out.println(test.findKthFromEnd(3));
        System.out.println(test.findKthFromEnd(4));
        System.out.println(test.findKthFromEnd(5));
        System.out.println(test.findKthFromEnd(6));
        System.out.println(test.findKthFromEnd(7));
        System.out.println(test.findKthFromEnd(8));
        System.out.println(test.findKthFromEnd(9));

    }
}
