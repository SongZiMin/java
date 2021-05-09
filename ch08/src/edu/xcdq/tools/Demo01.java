package edu.xcdq.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        String [] str = {"中文" , "计算机" , "ABC" , "123" , "qq@qq.com"};
        // 1 Arrays.asList(str)  将数组转换成列表
        List<String> list = Arrays.asList(str);
        System.out.println(list);

        // 2 把数组转成arraylist   new ArrayList<>(Arrays.asList(str));
        ArrayList<String> alist = new ArrayList<>(Arrays.asList(str));
        alist.add("haha");
        System.out.println(alist);
        alist.remove("ABC");
        System.out.println(alist);

        // 3 把数组转成Linkedlist  new LinkedList<>(Arrays.asList(str));
        LinkedList<String> llist = new LinkedList<>(Arrays.asList(str));
        llist.add("haha");
        System.out.println(llist);
        llist.remove("ABC");
        System.out.println(llist);

        // 4  将列表转换成数组  toArray()
        Object[] temp = llist.toArray();
        for ( Object o : temp ){
            System.out.print( o + "\t");
        }

    }
}
