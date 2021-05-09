package edu.xcdq.set;

import java.util.TreeSet;

public class ThreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<String > set = new TreeSet<>();
        set.add("111");
        set.add("222");
        set.add("aaa");
        set.add("ssadd");
        set.add("333");
        set.add("444");

       // System.out.println(set);
        for (String s : set){
            System.out.print(s+"\t");
        }
    }
}
