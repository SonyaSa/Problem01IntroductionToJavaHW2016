import java.util.Scanner;

/**
 * Created by YB on 21.3.2016 ?..
 */
public class Problem07GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        String n = Console.next();

        for (int i = 0; i < n.length(); i++) {
            char currNum = n.charAt(i);
            switch (currNum) {
                case '0': {
                    System.out.print("Gee");
                    break;
                }
                case '1': {
                    System.out.print("Bro");
                    break;
                }
                case '2': {
                    System.out.print("Zuz");
                    break;
                }
                case '3': {
                    System.out.print("Ma");
                    break;
                }
                case '4': {
                    System.out.print("Duh");
                    break;
                }
                case '5': {
                    System.out.print("Yo");
                    break;
                }
                case '6': {
                    System.out.print("Dis");
                    break;
                }
                case '7': {
                    System.out.print("Hood");
                    break;
                }
                case '8': {
                    System.out.print("Jam");
                    break;
                }
                default: {
                    System.out.print("Mack");
                }

            }
        }
    }
}
