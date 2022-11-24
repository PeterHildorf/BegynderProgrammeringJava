package Math_Class;

import java.util.Scanner;
public class Math_Class {
    public static void main(String[] args) {
        /*
        double x = 3.14;
        double y = 10;

        double z = Math.floor(x); // runder ned
                       .ceil      // runder op
                       .sqrt      // tager kvadratroden
                       .min       // minimum af værdien
                       .max       // Maximum af værdien

        System.out.println(z);
         */
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter youse y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is : "+z);

        scanner.close(); //Stopper scanner classen


    }
}
