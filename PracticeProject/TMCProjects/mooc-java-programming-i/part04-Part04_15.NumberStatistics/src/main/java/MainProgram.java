
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics totals = new Statistics();
        Statistics evenSums = new Statistics();
        Statistics oddSums = new Statistics();

        System.out.println("Enter numbers:");
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num != -1){
                totals.addNumber(num);
                if (num % 2 == 0) {
                    evenSums.addNumber(num);
                } else {
                    oddSums.addNumber(num);
                }
            } else {
                break;
            }
        }
        System.out.println("Sum: " + totals.sum());
        System.out.println("Sum of even numbers: " + evenSums.sum());
        System.out.println("Sum of odd numbers: " + oddSums.sum());


    }
}









// In order for the tests to work, the objects must be created in the
// correct order in the main program. First the object that tracks the total
// sum, secondly the object that tracks the sum of even numbers,
// and lastly the one that tracks the sum of odd numbers!