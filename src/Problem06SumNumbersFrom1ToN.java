import java.util.Scanner;

/**
 * Created by YB on 21.3.2016 ?..
 */
public class Problem06SumNumbersFrom1ToN {
    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);
        Integer n = Console.nextInt();

        Integer sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += n;
        }
        System.out.println(sum);
    }
}
