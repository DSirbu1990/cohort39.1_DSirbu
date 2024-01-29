import java.util.Collections;
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

    public static void removeSameValues(HashMap<String, String> map) {
        // создаю копию массива
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (HashMap.Entry<String, String> pair : copy.entrySet()){
            // применяю метод Collections.frequency, чтобы найти повторения
            int frequency = Collections.frequency(copy.values(), pair.getValue());
            // если такие имеются то передаём в метод для удаления.
            if (frequency > 1){
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
        System.out.println("Пары с уникальным значением: " + map);
    }


    //Создаю метод каторий удалит одинаковые значение
    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (HashMap.Entry<String, String> entry: copy.entrySet())
        {
            if (entry.getValue().equals(value))
                map.remove(entry.getKey());
        }
    }


}


