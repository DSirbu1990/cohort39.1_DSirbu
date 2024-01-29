import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;


public class MapTest {
    @Test
    public void TestRemoveSameValues () {
        HashMap<String, String> map = new HashMap<>();

        map.put("Александр","Губарь");
        map.put("Петр","Лобач");
        map.put("Сергей","Петров");
        map.put("Иван", "Василевский");
        map.put("Матвей","Петров");

        HashMap<String, String> expected = new HashMap<>();

        expected.put("Александр","Губарь");
        expected.put("Петр","Лобач");
        expected.put("Иван", "Василевский");

        Map.removeSameValues(map);
        HashMap<String,String> result = new HashMap<>(map);

        Assertions.assertEquals(expected,result);

    }
}
