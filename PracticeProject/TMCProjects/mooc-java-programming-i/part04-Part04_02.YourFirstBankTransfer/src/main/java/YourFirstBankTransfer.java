
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matt = new Account("Matthews account", 1000);
        Account mine = new Account("My account", 0);
        matt.withdrawal(100);
        mine.deposit(100);
        System.out.println(matt);
        System.out.println(mine);
    }
}
