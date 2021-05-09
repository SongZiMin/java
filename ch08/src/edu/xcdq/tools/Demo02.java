package edu.xcdq.tools;

import java.util.Arrays;
import java.util.HashSet;

public class Demo02 {
    public static void main(String[] args) {
        String [] str = {"中文" , "计算机" , "ABC" , "123" , "qq@qq.com"};
        // 1 将数组转换成集合set
        HashSet<String> set = new HashSet<>(Arrays.asList(str));
        System.out.println(set);

        // 2 将set转换成数组
        Object[] temp = set.toArray();
        for ( int i = 0 ; i < temp.length ; i ++ ){
            System.out.print(temp[i] + "\t");
        }
    }
}
