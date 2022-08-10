
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                items.add(new Item(name));
            } else {
                break;
            }
        }
        int size = 0;
        while (size < items.size()) {
            System.out.println(items.get( size));
            size++;
        }

    }
}
