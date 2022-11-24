package Random_Numbers;

import java.util.Random;
public class Random_Numbers {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(6)+1; //+1 fordi computere starter med 0 og op
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(z);
    }
}
