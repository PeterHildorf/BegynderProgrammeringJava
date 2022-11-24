package While_Loop;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as its condition remains true
        /* Dette er et while loop
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);
        */
        // nedenfor er et "do loop"
        Scanner scanner = new Scanner(System.in);
        String name = "";
        do {                                        // do loop gør at den vil altid execute koden i blokken
            System.out.println("enter your name: ");// hvorimod while loop tjekkero om conditionen er true
                                                    // før den executer
            name = scanner.nextLine();
        }while(name.isBlank());

        System.out.println("hello "+name);
    }

}
