package com.company;

public class Main {

    public static void main(String[] args){
       int nums[] = {1, 2, 3, 4, 5,  6, 7, 8, 9, 10};
       int sum = 0;
       //используем цикл в стиле for each для вывода суммирования значений из части массива
       for (int x : nums){
           System.out.println("Значение = " + x);
           sum += x;
           if (x == 5) break; //прервать цикл после 5 значений
       }
        System.out.println("Сумма пяти первых элементов = " + sum);
    }
}
