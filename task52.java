// Пусть дан список сотрудников (Иванов Иван). Написать программу, 
//которая найдет и выведет повторяющие имена и количество их повторений.
// Отсортировать по убыванию популярности.

import java.util.*;

public class task52 {
    public static void main(String[] args) {

        List<String> lst = Arrays.asList(
                "Иван Иванов", "Иван Петров", "Петр Иванов", "Максим Сидоров", "Мария Мышкина",
                "Анна Васильева", "Мария Захаров", "Петр Петров", "Георгий Жмых", "Петр Петренко",
                "Семен Быков", "Сидор Сидоров", "Сидор Петров", "Сидор Сидоров", "Сидор Иванов");
        List<String> names = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            names.add(lst.get(i).split(" ")[0]);
        }
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < names.size(); i++) {
            if (map.containsKey(names.get(i))) {
                int counter = map.get(names.get(i));
                map.put(names.get(i), ++counter);

            } else {
                map.put(names.get(i), 1);
            }
        }

        Map<Integer, List<String>> rMap = new TreeMap<>(Collections.reverseOrder());
        for (var i : map.entrySet()) {
            if (rMap.containsKey(i.getValue())) {
                rMap.get(i.getValue()).add(i.getKey());
            } else {
                List<String> countKey = new ArrayList<>();
                countKey.add(i.getKey());
                rMap.put(i.getValue(), countKey);
            }

        }
        for (var i : rMap.entrySet())
            System.out.println(i.getKey() + " " + i.getValue());
    }
}