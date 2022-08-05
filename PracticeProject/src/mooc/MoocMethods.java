// The following are various methods I created while practicing
// the Java Helsinki MOOC.
// Part 2: Methods and dividing the program into smaller parts
//=============================================================
package mooc;

import java.util.*;

public class MoocMethods {

	public static void main(String[] args) {
// EXERCISE: Advanced Astrology
		printSquare(5);
		System.out.println();
		printRectangle(3, 12);
		System.out.println();
		printTriangle(5);
		System.out.println();
		printChristmasTree(20);
	}
	public static void printChristmasTree(int height) {
		int treeBaseCounter = 0;
		for (int i = 1; i <= height; i++) {
			printSpaces((height)-i);
			printStars((i*2)-1);
			treeBaseCounter = i*2;
		}
		printSpaces((treeBaseCounter/2)-3);
		printStars(3);
		printSpaces((treeBaseCounter/2)-3);
		printStars(3);
	}
	public static void printTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			printSpaces(size-i);
			printStars(i);
		}
	}
	public static void printSpaces(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print(" ");
		}
	}
	public static void printStars(int number) {
		for (int i = 0; i < number; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void printSquare(int size) {
		for (int i = 0; i < size; i++) {
			printStars(size);
		}
	}
	public static void printRectangle(int height, int width) {
		for (int i = 0; i < height; i++) {
			printStars(width);
		}
	}
}

//=============================================================
// EXERCISE Number Uno:
//System.out.println(uno());
//
//}
//public static int uno() {
//Scanner scanner = new Scanner(System.in);
//System.out.println("Please enter an integer to use as a return value:");
//int num = Integer.valueOf(scanner.nextLine());
//return num;
//}
//=============================================================
// EXERCISE Summation:
//	int answer = sum(4, 3, 6, 1);
//	System.out.println("Sum: " + answer);
//}
//public static int sum(int num1, int num2, int num3, int num4) {
//	return num1 + num2 + num3 + num4;
//}
//=============================================================
// EXERCISE: Smallest
//int answer = smallest(5, 20);
//System.out.println("Smallest: " + answer);
//}
//public static int smallest(int num1, int num2) {
//if (num1 > num2) {
//	return num2;
//}
//return num1;
//}
//=============================================================
// EXERCISE: Averaging
//double result = avg(4, 3, 6, 1);
//System.out.println("Average: " + result);
//
//}
//public static double avg(int num1, int num2, int num3, int num4) {
//return (double) sum(num1, num2, num3, num4) / 4;
//}
//public static int sum(int num1, int num2, int num3, int num4) {
//return num1 + num2 + num3 + num4;
//}
//=============================================================