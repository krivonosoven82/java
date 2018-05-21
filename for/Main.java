package com.company;

public class Main {

    public static void main(String[] args){
        int a, b;
        for (a = 1, b = 4; a < b; a++, b--){
            System.out.println("a = " + a + "\nb = " + b);
        }
        System.out.println("После цикла а = " + a + " b = " + b);
    }
}
