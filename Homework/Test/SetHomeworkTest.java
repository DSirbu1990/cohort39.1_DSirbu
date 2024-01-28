import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetHomeworkTest {
    @Test
    public void TestForSetIntersection (){
        List<String> list1 = List.of("one","two","three","four","five","six");
        Set<String> test1 = new HashSet<>(list1);
        List<String> list2 = List.of("four","five","six","seven","eighth");
        Set<String> test2 = new HashSet<>(list2);

        List<String> expected1 = List.of ("four","five","six");
        Set<String> expected = new HashSet<>(expected1);

        Set<String> result = SetHomework.setIntersection(test1,test2);
        Assertions.assertEquals(expected, result);

    }

}
