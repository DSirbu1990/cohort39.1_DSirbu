package Map;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Александр","Губарь");
        map.put("Петр","Лобач");
        map.put("Сергей","Петров");
        map.put("Иван", "Василевский");
        map.put("Матвей","Петров");

        removeSameValues(map);

    }

    private static void removeSameValues(java.util.Map<String, String> map) {
        for (java.util.Map.Entry <String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (map.containsValue(value)){
                map.remove(key);
            }

            System.out.println(map);
        }
        
    }
}

