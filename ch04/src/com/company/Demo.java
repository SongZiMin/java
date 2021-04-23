package com.company;

public class Demo {
    public static void main(String[] args) {
       /* UncleOne uncleOne = new UncleOne();
        uncleOne.fahongbao();
        uncleOne.chouyan();

        UncleTwo uncleTwo = new UncleTwo();
        uncleTwo.fahongbao();
        uncleTwo.hejiu();*/

        /*UncleOneSon uncleOneSon = new UncleOneSon();
        uncleOneSon.fahongbao();*/

        //UncleOne uncleOne = new UncleOne();
        // 向上转型
        Uncle uncleOne1 = new UncleOne();
        uncleOne1.fahongbao();

        Uncle uncleTwo2 = new UncleTwo();
        uncleTwo2.fahongbao();
        //向下转型
        Uncle uncle = new Uncle();
        UncleOne temp =(UncleOne) uncle;
    }
}
