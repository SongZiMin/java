package edu.xcdq.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo01 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");   // 增加
        System.out.println(list);
        list.remove(1);  //  删除
        list.remove("444");
        System.out.println(list);
        list.set(2 , "55555");  // 修改
        System.out.println(list);
        // 查询
        for(String l : list){
            System.out.println(l + "\t");
        }
        System.out.println();
        for(int i  = 0; i <list.size();i++){
            System.out.println(list.get(i) + "\t");
        }


    }
}
