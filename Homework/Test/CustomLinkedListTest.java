import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomLinkedListTest {
    @Test
    public void TestForfindKthFromEnd (){
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

        assertEquals (10, test.findKthFromEnd(0));
        assertEquals (9, test.findKthFromEnd(1));
        assertEquals (8, test.findKthFromEnd(2));
        assertEquals (7, test.findKthFromEnd(3));
        assertEquals (6, test.findKthFromEnd(4));
        assertEquals (5, test.findKthFromEnd(5));
        assertEquals (4, test.findKthFromEnd(6));
        assertEquals (3, test.findKthFromEnd(7));
        assertEquals (2, test.findKthFromEnd(8));
        assertEquals (1, test.findKthFromEnd(9));
    }
}

