package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("---------");
        System.out.print("| ");
        for (int i = 0; i < 3; i++)
        {
            System.out.print(input.charAt(i) + " ");
        }
        System.out.println("|");
        System.out.print("| ");
        for (int i = 3; i < 6; i++)
        {
            System.out.print(input.charAt(i) + " ");
        }
        System.out.println("|");
        System.out.print("| ");
        for (int i = 6; i < 9; i++)
        {
            System.out.print(input.charAt(i) + " ");
        }
        System.out.println("|");
        System.out.println("---------");

        if (input.contains("_") || input.contains(" "))
        {
            System.out.println("Game not finished");
        }
        else if (input.contains("OOO") && input.contains("XXX"))
        {
            System.out.println("Impossible");
        }
        else if (input.contains("OOO"))
        {
            System.out.println("O wins");
        }
        else if (input.contains("XXX"))
        {
            System.out.println("X wins");
        }
        else
        {
            System.out.println("Draw");
        }
    }
}
