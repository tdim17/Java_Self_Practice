package Java_weekly_txt_practice_tasks.JD17_Maps;

import java.nio.charset.CharsetEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

public class MergeMaps {

    public static void main(String[] args) {

     Map<Character, Integer> map1 = new LinkedHashMap();
     Map<Character, Integer> map2 = new LinkedHashMap();

    Map<Character, Integer> map3 = new LinkedHashMap<>();

     map1.put('A',10);
     map1.put('B',20);
     map1.put('C', 40);

     map2.put('B',30);
     map2.put('C',40);
     map2.put('D', 55);


        for (Map.Entry<Character, Integer> eachMap1 : map1.entrySet()) {
            eachMap1.getKey();  // A, B
            if (  map2.containsKey ( eachMap1.getKey()) ) {
                map3.put((eachMap1.getKey()), (map1.get(eachMap1.getKey()) + map2.get(eachMap1.getKey())));

            } else {
                map3.putAll(map1);
                map3.putAll(map2);
            }
        }

        System.out.println(map3);





                // map1.get( eachMap1.getKey()) + map2.get(eachMap1.getKey())
                //              A                               A

    }
}

/*
3. Create a class named MergeMaps and write a program that merge two given maps.
If a key is present in both maps, add their corresponding values together.

         Example:
               map1 = {'A'=10, 'B'=20}
               map2 = {'B'=30, 'C'=40}

         Output:
               {'A'=10, 'B'=50, 'C'=40}

 */
