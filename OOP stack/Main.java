package com.company;
//Вычисляем обьем параллелепипеда
public class Main {

    public static void main(String[] args) {
            Stack mystack1 = new Stack();
            Stack mystack2 = new Stack();
            //разместить числа в стеке
            for (int i = 0; i < 10; i++) mystack1.push(i);
            for (int i = 10; i < 20; i++) mystack2.push(i);

            //извлечь эти числа из стека
            System.out.println("Содержимое стека mystack1: ");
            for (int i  = 0; i < 10; i++){
                System.out.print(mystack1.pop() + " ");
            }
            System.out.println();
            System.out.println("Содержимое стека mystack2: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(mystack2.pop() + " ");
            }
        }
    }
//Определяем целочисленный стек, в котором можно хранить до 10 целочисленных значений
    class Stack {
        int stck[] = new int[10];
        int tos;

        //инициализировать вершину стека
        Stack () {
            tos = -1;
        }
        //разместить элемент в стеке
        void push (int item) {
            if (tos == 9){
                System.out.println("Стек заполнен.");
            } else {
                stck[++tos] = item;
            }
        }
        //извлечь элемент из стека
        int pop () {
            if (tos < 0) {
                System.out.println("Стек не загружен.");
                return 0;
            } else {
                return stck[tos--];
            }
        }
    }