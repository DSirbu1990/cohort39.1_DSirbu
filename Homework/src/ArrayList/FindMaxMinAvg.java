package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaxMinAvg {

    /**Заполните ArrayList случайными числами.
     * Напишите методы для нахождения максимального, минимального и среднего значения в списке
     * (сумма всех значений, деленая на количество элементов).
     */
    public static void main(String[] args) {
        //создаю пустой список
        ArrayList<Integer> integer = new ArrayList<>();
        //добавляю значение в список
        integer.add(56);
        integer.add(4);
        integer.add(78);
        integer.add(34);
        integer.add(52);
        integer.add(8);
        integer.add(2);
        integer.add(35);
        integer.add(7);
        integer.add(9);

        // В пакетике java.util.Collections есть уже готовые методы на такой случай.
        // Они так и называются: max и min.
        System.out.println("Max value = " + Collections.max(integer));
        System.out.println("Min value = " + Collections.min(integer));

        //Еще вариант стандартный: занести в переменные min и max первый элемент списка,

        int min = integer.get(0);
        int max = integer.get(0);
        // затем проходить в цикле и сравнивать число на итерации с числом в переменных, для этого использую for-each
        for (Integer i: integer) {
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }
        System.out.println(min);
        System.out.println(max);

        //Для того чтобы найти среднее значения в списке нужно сначала определить сумму всех значений
        double sum = 0;
        for(Integer value:integer){
            sum += value;
        }
        //потом сумму всех значений делим на количество элементов (integer.size())
        double avg =  sum / integer.size();

        System.out.println("Average value = " + avg );


    }

    }



