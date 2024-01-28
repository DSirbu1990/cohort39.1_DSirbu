package Set;

import java.util.HashSet;

/**
 * Пересечение множеств: Напишите метод, который принимает два множества и возвращает новое множество,
 * содержащее их пересечение. (Допустимо взять Set<String>)
 * (Только те элементы, которые содяржаться в обоих Set) Напишите тесты для вашего метода
 */
public class SetHomework {
    public static void main(String[] args) {

          java.util.Set<String> football = new HashSet<>(); // set footballs team
          java.util.Set<String> volleyball = new HashSet<>();// set volleyball team

          football.add ("Smith");
          football.add("Miller");
          football.add("Davis");
          football.add("Johnson");
          football.add("Garcia");
          football.add("Wilson");
          football.add("Thomas");

          volleyball.add("Rodriguez");
          volleyball.add("Thomas");
          volleyball.add("Jones");
          volleyball.add("Brown");
          volleyball.add("Johnson");
          volleyball.add("Taylor");
          volleyball.add("Wilson");

          System.out.println("In both teams are registered:" + setIntersection(football, volleyball)); //использую сосданный метод


    }

    //Создаю метод который вернет только те элементы, которые содержаться в обоих Set
    public static java.util.Set<String> setIntersection (java.util.Set<String> set1, java.util.Set<String> set2 ){
          set1.retainAll(set2);
          return set1 ;
    }



}
