package edu.xcdq.list;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        String [] str = new String[]{"1e21" , "12q" , "DDADADS"}; // 数组列表 底层是数组
        str[0] = "111";
        str[1] = "222";
        str[2] = "333";
        // 删除位置为1的元素
        str[1] = str[2];
        str[2] = null;

        ArrayList<String> list = new ArrayList<>();
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
