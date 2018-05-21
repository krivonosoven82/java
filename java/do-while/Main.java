package com.company;

//import java.io.IOException;

public class Main {

    public static void main(String[] args) throws java.io.IOException {
            char choice;
            do{
                System.out.println("Справка по оператору:"
                    + "\n  1.if"
                    + "\n  2.switch"
                    + "\n  3. while"
                    + "\n  4. do-while"
                    + "\n  5. for"
                    + "\n"
                    + "\nВыберите нужный пункт:"
                );
                choice = (char) System.in.read();
            } while((choice < '1') || (choice > '5'));
            System.out.println("\n");

            switch(choice){
                case '1':
                    System.out.println("if:\n"
                        + "\n if (условие) оператор;"
                        + "\n else оператор;");
                    break;
                case '2':
                    System.out.println("switch:\n"
                        + "\n switch (выражение) {"
                        + "\n case константа:"
                        + "\n последовательность операторов"
                        + "\n break;"
                        + "\n // ..."
                        + "\n }"
                    );
                    break;
                case '3':
                    System.out.println("while:\n"
                        + "\n while (условие) оператор;");
                    break;
                case '4':
                    System.out.println("do-while:\n"
                        + "\n do {"
                        + "\n     оператор;"
                        + "\n } while (условие);");
                    break;
                case '5':
                    System.out.println("for:\n"
                        + "\n for (инициализация; условие; итерация) {"
                        + "\n   оператор;"
                        + "\n }");
                    break;
            }
    }
}
