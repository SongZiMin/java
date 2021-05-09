package edu.xcdq.set;

import java.util.HashSet;

public class HashSetDemo01 {
    public static void main(String[] args) {
        // set 集合 ：确定性 无序性
        HashSet<String > set = new HashSet<>();
        set.add("111");
        set.add("222");
        set.add("aaa");
        set.add("ssadd");
        set.add("333");
        set.add("444");
        set.add("444");
        System.out.println(set);
        set.remove("444");
        System.out.println(set);

        for(String s: set){
            System.out.println(s + "\t");
        }
    }
}
