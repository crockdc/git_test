
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shall we carry on?");
        while (true) {
            String ans = scanner.nextLine();
            if (ans.equals("no")) {
                break;
            }
            System.out.println("Shall we carry on?");

        }






    }
}
