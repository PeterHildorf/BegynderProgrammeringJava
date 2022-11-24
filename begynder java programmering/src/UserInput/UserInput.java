package UserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

        System.out.println("what is ur name? ");
        String name = scanner.nextLine();

        System.out.println("how old are u? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is ur favorite food? ");
        String food = scanner.nextLine();


        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("u like " +food);
    }
}
