package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Demo03 {
    public static void main(String[] args) {
        HashMap<String ,String> map = new HashMap<>();
        map.put("1" , "haha");
        map.put("2" , "hehe");
        map.put("3" , "huihui");
        map.put("4" , "heihei");

        // 将map中的键取出组成一个集合
        System.out.println(map.keySet());
        // 将map中的键取出组成一个列表
        ArrayList<String> list = new ArrayList<>(map.keySet());
        System.out.println(list);

        //将map中的值取出组成一个集合
        System.out.println(map.values());
        //将map中的值取出组成一个列表
        LinkedList<String> list2 = new LinkedList<>(map.values());
        System.out.println(list2);
    }
}
