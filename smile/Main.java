package com.company;

public class Main {

    public static void main(String[] args) {
        char smile[][] = new char[9][9];
        int i, j;

            for(i = 0; i < 9; i++){
                for(j = 0; j < 9; j++ ){
                    
                    smile[i][j] = ' ';

                    if((i == 0 && j > 0) && (i == 0 && j < 8)){
                        smile[i][j] = 88;
                    }
                    if((i > 0 && j == 0) && (i < 8 && j == 0)){
                        smile[i][j] = 88;
                    }
                    if((i == 8 && j > 0) && (i == 8 && j < 8)){
                        smile[i][j] = 88;
                    }
                    if((i > 0 && j == 8) && (i < 8 && j == 8)){
                        smile[i][j] = 88;
                    }
                    if((i == 2 && j == 2)||(i == 2 && j == 6)){
                        smile[i][j] = 88;
                    }
                    if((i == 3 && j == 4)||(i == 4 && j == 4)){
                        smile[i][j] = 88;
                    }
                    if((i == 5 && j == 2)||(i == 5 && j == 6)){
                        smile[i][j] = 88;
                    }
                    if((i == 6 && j > 2) && (i == 6 && j < 6)){
                        smile[i][j] = 88;
                    }
                    System.out.print(smile[i][j] + "    ");
                }
                System.out.println("\n");
            }
        }
    }
