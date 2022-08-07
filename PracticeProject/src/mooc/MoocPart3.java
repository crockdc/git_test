// The following are exercises from Helsinki MOOC Part 3: Lists
//========================================================================

package mooc;

import java.util.Scanner;
import java.util.ArrayList;

public class MoocPart3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			System.out.println("Add number('0' exits):");
			int num = Integer.valueOf(scan.nextLine());
			if (num != 0) {
				list.add(num);
				continue;
			}
			break;

		}
		printSum(list);

	}

	public static void printSum(ArrayList<Integer> listName) {
		int sum = 0;
		for (int num : listName) {
			sum += num;
		}
		System.out.println("Sum of the list is: " + sum);
	}
}

//========================================================================
// EXERCISE: Smallest In List
//Scanner scan = new Scanner(System.in);
//ArrayList<Integer> list = new ArrayList<>();
//while (true) {
//	System.out.println("please input a number('0' will exit):");
//	int num = Integer.valueOf(scan.nextLine());
//	if (num > 0) {
//		list.add(num);
//
//	} else {
//		break;
//	}
//
//}
//int smallest = list.get(0);
//
//for (int i = 0; i < list.size(); i++) {
//
//	if (list.get(i) < smallest) {
//		smallest = list.get(i);
//	}
//}
//System.out.println(smallest);

//=========================================================================
// EXERCISE: Index Of
//Scanner scan = new Scanner(System.in);
//ArrayList<Integer> list = new ArrayList<>();
//while (true) {
//	System.out.println("please input a number('0' will exit):");
//	int num = Integer.valueOf(scan.nextLine());
//	if (num > 0) {
//		list.add(num);
//
//	} else {
//		break;
//	}
//
//}
//System.out.println("Please search for a number previously entered:");
//int search = Integer.valueOf(scan.nextLine());
//for (int i = 0; i < list.size(); i++) {
//	if (list.get(i) == search) {
//		System.out.println(search + " was found at index " + i);
//		break;
//	}
//}

//========================================================================
// EXERCISE: Average of a List
//Scanner scan = new Scanner(System.in);
//ArrayList<Integer> list = new ArrayList<>();
//while (true) {
//	System.out.println("please input a number('0' will exit):");
//	int num = Integer.valueOf(scan.nextLine());
//	if (num > 0) {
//		list.add(num);
//
//	} else {
//		break;
//	}
//
//}
//int counter = 0;
//int sum = 0;
//for (int numbers : list) {
//	sum += numbers;
//	counter += 1;
//
//}
//System.out.println("The average is: " + ((double)sum / counter));

//=======================================================================
// EXERCISE: On The List
//Scanner scan = new Scanner(System.in);
//ArrayList<String> list = new ArrayList<>();
//while (true) {
//	System.out.println("Add a name and press enter(leave blank "
//			+ "and press enter to exit):");
//	String name = scan.nextLine();
//	if (!name.equals("")) {
//		list.add(name.toLowerCase());
//		continue;
//	}
//	break;
//
//}
//System.out.println("Please enter a name to search the new list:");
//String searchName = (scan.nextLine().toLowerCase());
//boolean nameFound = list.contains(searchName);
//if (nameFound) {
//	System.out.println(searchName + " was found!");
//} else {
//System.out.println(searchName + " was not found, sorry!");
//}

//========================================================================
// EXERCISE: Print in Range
//Scanner scan = new Scanner(System.in);
//ArrayList<Integer> list = new ArrayList<>();
//while (true) {
//	System.out.println("Add number('0' exits):");
//	int num = Integer.valueOf(scan.nextLine());
//	if (num > 0) {
//		list.add(num);
//		continue;
//	}
//	break;
//
//}
//printList(list, 2, 6);
//
//}
//
//public static void printList(ArrayList<Integer> listName, int lowerLim, int upperLim) {
//System.out.println("The number in the range [" + lowerLim + ", " + upperLim + "]");
//for (int num : listName) {
//	if ((num > lowerLim) && (num < upperLim)) {
//		System.out.println(num);
//	}
//}

//=======================================================================
// EXERCISE: Sum
//Scanner scan = new Scanner(System.in);
//ArrayList<Integer> list = new ArrayList<>();
//while (true) {
//	System.out.println("Add number('0' exits):");
//	int num = Integer.valueOf(scan.nextLine());
//	if (num != 0) {
//		list.add(num);
//		continue;
//	}
//	break;
//
//}
//printSum(list);
//
//}
//
//public static void printSum(ArrayList<Integer> listName) {
//int sum = 0;
//for (int num : listName) {
//	sum += num;
//}
//System.out.println("Sum of the list is: " + sum);

//========================================================================