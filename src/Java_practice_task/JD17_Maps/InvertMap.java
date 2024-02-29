package Java_practice_task.JD17_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class InvertMap {

    public static void main(String[] args) {

        Map <Integer, String> map1 = new LinkedHashMap<>();

        map1.put(1,"a");
        map1.put(2,"b");
        map1.put(3,"c");

        Map<String, Integer> map2 = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> eachMap1 : map1.entrySet()) {
            int x = eachMap1.getKey();
            String str = eachMap1.getValue();
            map2.put(str,x);
        }
        System.out.println(map2);

        // System.out.println(map2.size());
    }
}
/*
2. Create a class named InvertMap and write a program that returns a new map which is the inverted version of the provided map,
meaning the keys become values and the values become keys.
It is assumed that there are no duplicate values in the original map.

         Example:
               map = {1="a", 2="b", 3="c"}

         Output:
               {"a"=1, "b"=2, "c"=3}
 */
