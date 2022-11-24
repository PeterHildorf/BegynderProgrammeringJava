package Swaptwovariables;

public class SwapTwoVariables {
    public static void main(String[] args) {
        String x = "Høj";
        String y = "længde";
        String Meter;

        Meter = x;
        x=y;
        y= Meter;

        System.out.println("x: " + x);
        System.out.println("y: "+y);

    }
}
