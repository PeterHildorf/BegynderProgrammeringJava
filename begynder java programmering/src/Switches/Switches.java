package Switches;

public class Switches {
    public static void main(String[] args) {
        //switch = statement that allows a variable to be tested for equality against a list of values
        // bedre at bruge hvis man har en masse else if statements
        // Kan bruges til matador måske?

        String day = "Sauce";

        switch(day) {
            case "Sunday": System.out.println("it is sunday!");
                break;
            case "Monday": System.out.println("it is Monday!");
                break;
            case "Tuesday": System.out.println("it is Tuesday!");
                break;
            case "Wednesday": System.out.println("it is Wednesday!");
                break;
            case "Thursday": System.out.println("it is Thursday!");
                break;
            case "Friday": System.out.println("it is Friday!");
                break;
            case "Saturday": System.out.println("it is saturday!");
                break;
            default: System.out.println("That is not a day!");

        }
    }
}
