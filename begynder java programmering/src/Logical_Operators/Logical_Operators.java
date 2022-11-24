package Logical_Operators;

import java.util.Scanner;

public class Logical_Operators {
    public static void main(String[] args) {
        // Logical operators = used to connect two or more expressions
        //
        //                      && = (and) both conditions must be true
        //                      || = (or) either condition must be true
        //                      ! = (not) reverses boolean value of condition
        
        int temp = 20;

        if(temp>=30) {
            System.out.println("It is hot outside");
        }
        else if (temp>=20 && temp<=30) {
            System.out.println("it is warm outside");
        }
        else {
            System.out.println("It is cold outside");
            
        }

        /////////////////////////////////////////////

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("you are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q")||response.equals("Q")) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("you are still playing the game pew pew ");
        }
         */
        System.out.println("you are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("you are still playing the game *pew pew* ");  
        }
        else {
            System.out.println("you quit the game");
        }
    }
}