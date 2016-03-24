import java.util.Scanner;

/**
 * Created by YB on 21.3.2016 ?..
 */
public class Problem05PrintACharacterTriangle {
    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);
        Integer n = Console.nextInt();

        for (int i = 1; i <= n + 1; i++) {
            for (int c = 1; c < i ; c++) {
                System.out.print((char)(c + 96));
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i --) {
            for (int c = 1; c <= i ; c ++) {
                System.out.print((char)(c + 96));
            }
            System.out.println();
        }

    }
}
