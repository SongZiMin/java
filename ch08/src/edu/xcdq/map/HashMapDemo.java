package edu.xcdq.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String > map = new HashMap<>();  //钻石语法
        map.put(1 , "hahah");
        map.put(2 , "adada");
        map.put(3 , "ffafa");
        map.put(4 , "tttgt");

        System.out.println(map);

        for (Map.Entry<Integer, String> e : map.entrySet() ){
            System.out.println(e.getKey() + " = " + e.getValue() +"\t" );
        }
        System.out.println();

        for (Integer i : map.keySet() ){
            System.out.println(i + "=" + map.get(i) );
        }

        System.out.println();
        for (String v : map.values() ){
            System.out.println( v + "\t");
        }
    }
}
