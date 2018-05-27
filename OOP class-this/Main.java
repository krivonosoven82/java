package com.company;
//Вычисляем обьем параллелепипеда
public class Main {

    public static void main(String[] args) {
        //обьявляем, выделяем и инициализируем обьекты типа Box
        Box mybox1 = new Box (10, 20, 15);
        Box mybox2 = new Box (3, 6, 9);

        double vol;

        //получить обьем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Обьем равен: " + vol);
        //получить обьем второго пораллелепипеда
        vol = mybox2.volume();
        System.out.println("Обьем равен: " + vol);
        }
    }

    class Box {
        double width;
        double height;
        double depth;

        //Конструктор
        Box (double width, double height, double depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        //Рассчитать и возвратить обьем
        double volume (){
            return width * height * depth;
        }
    }