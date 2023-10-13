package Homework_6;

import java.util.*;
import java.util.stream.IntStream;

public class NumberList {
    public List<Integer> createList(int size){
        Random random = new Random();
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numberList.add(random.nextInt(1, 11));
        }
        return numberList;
    }
    public String compareList(List<Integer> list1, List<Integer> list2){
        if(list1 == null || list2 == null)
            return "Список пуст";
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < list1.size(); i++) {
            result1 += list1.get(i);
            result2 += list2.get(i);
        }
        result1 = result1 / list1.size();
        result2 = result2 / list2.size();
        if(result1 > result2) return "Первый список больше второго";
        else if (result2 > result1) return "Второй список больше первого";
        else return "Они равны";
    }
}
