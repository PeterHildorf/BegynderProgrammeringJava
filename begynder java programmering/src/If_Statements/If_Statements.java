package If_Statements;

public class If_Statements {
    public static void main(String[] args) {
       //if statement = performs a block of code if it's condition evaluates to be true

       int age = 76;

       if(age==75) {
           System.out.println("ok boomer!");
       }
       else if (age>=18) {
           System.out.println("you are an adult");
       }
       else if (age >=13) {
           System.out.println("you are a teenager!");
       }
       else {
           System.out.println("You are not an adult!");
       }
    }
}
