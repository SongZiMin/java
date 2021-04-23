package com.company;

public class Demo02 {
    public static void main(String[] args) {
        UncleOne dajiu = new UncleOne();
        ganhuo(dajiu);

        UncleTwo erjiu = new UncleTwo();
        ganhuo(erjiu);

    }
    public static void ganhuo( Uncle uncle){
        if ( uncle instanceof UncleOne){
            System.out.println("出门外干活");
        }else if( uncle instanceof UncleTwo){
            System.out.println("在室内干活");
        }else {
            System.out.println("传入的不是舅舅，老太太没办法");
        }
    }
} 
