package com.company;

public class Main {

    public static void main(String[] args){
        int i = 0;
        boolean done = false;
        System.out.println("Переменная done перед циклом = " + done);
        for (; !done; ){
            System.out.println("i = " + i);
            if (i == 10) done = true;
            i++;
        }
        System.out.println("Переменная done после цикла = " + done);
    }
}
