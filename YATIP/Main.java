package com.company;

public class Main {

    public static void main(String[] args) {
        char smile[][] = new char[5][22];
        int i, j;
            //Пишем слова YATIP
            for(i = 0; i < 5; i++){
                for(j = 0; j < 22; j++ ){

                    smile[i][j] = ' ';
                    if(     //Y
                            (i == 0 && j == 0) || (i == 0 && j == 4) ||
                            (i == 1 && j == 1) || (i == 1 && j == 3) ||
                            (i >= 2 && j == 2) ||
                            //A
                            (i >= 0 && j == 8) || (i == 1 && j == 7) ||
                            (i == 2 && (j > 5 && j < 9)) ||
                            (i > 1 && j == 6) ||
                            //T
                            (i == 0 && (j > 9 && j < 15 )) || (i > 0 && j == 12) ||
                            //I
                            (i >= 0 && j == 16) ||
                            //P
                            (i >= 0 && j == 18) || (i == 0 && (j > 18 && j < 21)) ||
                            (i == 1 && j == 21) || (i == 2 && (j > 18 && j < 21))
                    ){
                        smile[i][j] = '*';
                    }
                    System.out.print(smile[i][j] + " ");
                }
                System.out.println();
            }
        }
    }