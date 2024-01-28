package Map;

import java.util.HashMap;

/**
 * Работа с Map
 * Реализовать метод removeSameValues(Map<K, V> map).
 * Данный метод должен принимать в качестве аргумента мапу,
 * ваша задача - Оставить в данной мапе исключительно пары с уникальным значением (не ключом).
 * null - также может быть представлен, в этом случае допустимо оставить только одно null значение в мапе.
 * упрощенная версия: использовать данный метод на основе removeSameValues(Map<String, String> map)
 *
 */

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

