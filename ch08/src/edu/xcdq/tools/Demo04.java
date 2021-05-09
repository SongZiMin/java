package edu.xcdq.tools;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo04 {
    public static void main(String[] args) {
        HashMap<String, String>map = new HashMap<>();
        map.put("1","aaa");
        for (int i = 0; i<1000; i++){
            map.put(String.valueOf(i) , "aaa" + i);
        }
        //迭代器
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> next = iterator.next();
            System.out.println(next);
        }


    }
}
