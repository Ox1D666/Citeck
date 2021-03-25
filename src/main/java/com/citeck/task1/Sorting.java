package com.citeck.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Сортировка массива по колличеству вхождений, в случае равного колличества
 * числа сортируются по возростанию значения.
 */
public class Sorting {
    public Set<Number> sort(Integer[] nums) {
        Set<Number> result = new TreeSet<>();
        Map<Integer, Integer> container = new HashMap<>();
        for (Integer el :
                nums) {
            if (container.containsKey(el)) {
                int count = container.get(el);
                count++;
                container.put(el, count);
            } else {
                container.put(el, 1);
            }
        }
        for(int el: container.keySet()){
            result.add(new Number(el, container.get(el)));
        }
        return result;
    }
}
