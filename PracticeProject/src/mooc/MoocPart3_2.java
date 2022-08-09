// The following are exercises from Helsinki MOOC Part 3: Arrays, Strings
//========================================================================

package mooc;

import java.util.Scanner;

public class MoocPart3_2 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a name, a comma(no spaces), then a number:");
		int oldest = 0;
		String oldestName = "";
		while (true) {
			String nameAge = x.nextLine();
			if (!nameAge.equals("")) {
				String[] nameAgeArray = nameAge.split(",");
				for (int i = 0; i < nameAgeArray.length; i++) {
					if (Integer.valueOf(nameAgeArray[1]) > oldest) {
						oldest = Integer.valueOf(nameAgeArray[1]);
						oldestName = nameAgeArray[0];
					}
				}

			} else {
				break;
			}
		}
		System.out.println(oldestName + " is the oldest at " + oldest + " years old.");
	}
	
	public static void oldest(String string) {
		
	}
	MoocPart3_2 mooc = new MoocPart3_2();
}

//========================================================================
// EXERCISE: Swap
//Scanner x = new Scanner(System.in);
//System.out.println("How long do you want the array to be?");
//int howMany = Integer.valueOf(x.nextLine());
//String[] array = new String[howMany];
//int[] ints = new int[howMany];
//System.out.println("input " + howMany + " numbers:");
//for (int i = 0; i < howMany; i++) {
//	ints[i] = Integer.valueOf(x.nextLine());
//	
//}
//System.out.println("Please input two indices to swap:");
//int swap1 = Integer.valueOf(x.nextLine());
//int swap2 = Integer.valueOf(x.nextLine());
//int swappedTo = ints[swap1];
//ints[swap1] = ints[swap2];
//ints[swap2] = swappedTo;
//for (int i = 0; i < howMany; i++) {
//	System.out.print(ints[i]);
//}

//========================================================================
//EXERCISE: Index Was Not Found
//Scanner x = new Scanner(System.in);
//System.out.println("How long do you want the array to be?");
//int howMany = Integer.valueOf(x.nextLine());
//String[] array = new String[howMany];
//int[] ints = new int[howMany];
//System.out.println("input " + howMany + " numbers:");
//for (int i = 0; i < howMany; i++) {
//	ints[i] = Integer.valueOf(x.nextLine());
//	
//}
//System.out.println("Please input a number to search for:");
//int searchNum = Integer.valueOf(x.nextLine());
//int length = 0;
//while (length < ints.length) {
//	if (searchNum == ints[length]) {
//		System.out.println(searchNum + " is located at index " + length);
//	}
//	length++;
//}

//========================================================================
// EXERCISE: Sum of Array
//Scanner x = new Scanner(System.in);
//System.out.println("How long do you want the array to be?");
//int howMany = Integer.valueOf(x.nextLine());
//String[] array = new String[howMany];
//int[] ints = new int[howMany];
//System.out.println("input " + howMany + " numbers:");
//for (int i = 0; i < howMany; i++) {
//	ints[i] = Integer.valueOf(x.nextLine());
//
//}
//
//printSum(ints);
//
//}
//public static void printSum(int[] array) {
//int sum = 0;
//int index = 0;
//while (index < array.length) {
//	sum += array[index];
//	index++;
//}
//System.out.println("The sum of the array is " + sum);
//}

//========================================================================
// EXERCISE: Print Neatly
//Scanner x = new Scanner(System.in);
//System.out.println("How long do you want the array to be?");
//int howMany = Integer.valueOf(x.nextLine());
//String[] array = new String[howMany];
//int[] ints = new int[howMany];
//System.out.println("input " + howMany + " numbers:");
//for (int i = 0; i < howMany; i++) {
//	ints[i] = Integer.valueOf(x.nextLine());
//
//}
//
//printNeatly(ints);
//
//}
//
//public static void printNeatly(int[] array) {
//int index = 0;
//while (index < array.length) {
//	System.out.print(array[index]);
//	if (index + 1 != array.length) {
//		System.out.print(", ");
//	}
//	index++;
//}
//}

//=======================================================================
// EXERCISE: Print Stars
//Scanner x = new Scanner(System.in);
//System.out.println("How long do you want the array to be?");
//int howMany = Integer.valueOf(x.nextLine());
//String[] array = new String[howMany];
//int[] ints = new int[howMany];
//System.out.println("input " + howMany + " numbers:");
//for (int i = 0; i < howMany; i++) {
//	ints[i] = Integer.valueOf(x.nextLine());
//
//}
//
//printStars(ints);
//
//}
//
//public static void printStars(int[] array) {
//int index = 0;
//while (index < array.length) {
//	for (int i = 0; i < array[index]; i++) {
//		System.out.print("*");
//	}
//	System.out.println();
//	index++;
//}
//}

//=======================================================================
// EXERCISE: Login
//Scanner x = new Scanner(System.in);
//login("alex", "sunshine");
//
//}
//public static void login(String un, String pw) {
//Scanner x = new Scanner(System.in);
//System.out.println("Enter username:");
//String inputUn = x.nextLine();
//System.out.println("Enter password:");
//String inputPw = x.nextLine();
//if (!(inputUn.equals(un) && inputPw.equals(pw))){
//	System.out.println("Incorrect username or password");
//} else {
//	System.out.println("Logged in successfully");
//}
//}

//========================================================================
// EXERCISE: Contains
//Scanner x = new Scanner(System.in);
//searchString("Does the Navy have "
//		+ "Java or Javascript programmers?");
//}
//public static void searchString(String string) {
//Scanner x = new Scanner(System.in);
//String[] linesArray = string.split("\n");
//for (int i = 0; i < linesArray.length; i++) {
//	String words = linesArray[i];
//	String[] wordsArray = words.split(" ");
//	for (int j = 0; j < wordsArray.length; j++) {
//		if (wordsArray[j].contains("av")) {
//			System.out.println(linesArray[i] + " CONTAINS 'av' with the word " + wordsArray[j] + "\n");
//		}
//	}
//}
//
//}