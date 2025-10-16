package scannerExample;
import java.util.*;

public class ScannerPractice {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you age ");
        float age = sc.nextFloat();
        System.out.println("Your age is " + age);
        sc.close();
    }
}
