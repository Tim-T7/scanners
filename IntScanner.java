/**
 * Write a description of class scanners here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class IntScanner
{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = "";
            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                int b = 3 * a;
                System.out.println(b);
            }
            scanner.useDelimiter(",|\n");
            if (scanner.hasNext()) {
                str = scanner.next();
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}