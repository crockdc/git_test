
import java.util.ArrayList;
import java.util.Scanner;


public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 9999) {
                break;
            }
            list.add(num);
        }
        int i = 0;
        int smallest = list.get(0);
        while (i < list.size()) {
            if (smallest > list.get(i) ) {
                smallest = list.get(i);
            }
            i++;
        }
        System.out.println("Smallest number: " + smallest);
        int j = 0;
        while (j < list.size()) {
            if (list.get(j) == smallest) {
                System.out.println("Found at index: " + j);
            }
            j++;
        }



        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
