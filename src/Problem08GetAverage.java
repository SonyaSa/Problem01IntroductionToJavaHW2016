import java.util.Scanner;

/**
 * Created by YB on 24.3.2016 ?..
 */
public class Problem08GetAverage {

    public static void main(String[] args) {
        Scanner Console = new Scanner((System.in));

        float a = Float.parseFloat(Console.nextLine());
        float b = Float.parseFloat(Console.nextLine());
        float c = Float.parseFloat(Console.nextLine());

        float averrage = (a + b + c)/3;

        System.out.printf("%.2f", averrage);

    }
}
