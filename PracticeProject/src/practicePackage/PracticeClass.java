/* PROGRAM:    SORTING ARRAYS - (STUDY.COM CS201 ASSIGNMENT PART 1)
 * PROGRAMMER: DANIEL CROCKER
 * PURPOSE:    DEMONSTRATE HOW TO CREATE A TWO DIMENSIONAL ARRAY, 
 * 			   BUBBLE SORT THE ARRAY, AND ITERATE THROUGH IT WHILST INTERACTING WITH THE USER.
 * DATE:       07/19/2022 
 -------------------------------------------------------------------------------------*/
package practicePackage;

//IMPORT JAVA UTILITY PACKAGE
import java.util.*;

public class PracticeClass {	

	public static void main(String[] args) {

		// CREATE SCANNER OBJECT FOR INPUT
		Scanner scanner = new Scanner(System.in);

		// CREATE A TWO DIMENSIONAL ARRAY OF STATES AND CAPITALS IN ALPHABETICAL ORDER
		// BY STATE. THIS ARRAY HAS 2 ROWS AND 50 COLUMNS. ROW 1 ARE STATES AND ROW 2
		// ARE THEIR CORRESPONDING CAPITALS
		String[][] stateCapArray = {
				{ "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware",
						"Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky",
						"Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi",
						"Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
						"New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania",
						"Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont",
						"Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" },
				{ "Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover",
						"Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines",
						"Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul",
						"Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton",
						"Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg",
						"Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier",
						"Richmond", "Olympia", "Charleston", "Madison", "Cheyenne" } };

		// DISPLAY THE CURRENT TWO DIMENSIONAL ARRAY IN ORDER BY STATE
		System.out.println("The following are the states and capitals in order by state name:\n");
		for (int i = 0; i < 50; i++) {
			// ITERATE THROUGH THE FIRST AND SECOND ROWS COLUMN BY COLUMN UNTIL 50
			// ITERATIONS OF THE FOR LOOP ARE COMPLETED
			System.out.println(stateCapArray[1][i] + " is the state capital of " + stateCapArray[0][i] + ".\n");
		}

		// SORT THE TWO DIMENSIONAL ARRAY ALPHABETICALLY BY CAPITAL USING THE BUBBLE
		// SORT METHOD
		for (int i = 0; i < stateCapArray[0].length; i++) {
			// NESTED FOR LOOP
			for (int j = i + 1; j < stateCapArray[0].length; j++) {
				// INITIALIZE TWO STRING VARIABLES TO ASSIST WITH SORTING THE ARRAY
				String capital;
				String state;
				// IF STATEMENT USED TO SORT THE ARRAY BY CAPITAL(ROW 2)
				if (stateCapArray[1][j].compareTo(stateCapArray[1][i]) < 0) {
					capital = stateCapArray[1][i];
					stateCapArray[1][i] = stateCapArray[1][j];
					stateCapArray[1][j] = capital;
					state = stateCapArray[0][i];
					stateCapArray[0][i] = stateCapArray[0][j];
					stateCapArray[0][j] = state;
				}
			}
		}
		// DISPLAY THE ARRAY AFTER THE BUBBLE SORT METHOD SORTS BY CAPITAL
		System.out.println("The following are the states and capitals in order by capital name:\n");
		for (int i = 0; i < 50; i++) {
			// ITERATE THROUGH THE FIRST AND SECOND ROWS COLUMN BY COLUMN UNTIL 50
			// ITERATIONS OF THE FOR LOOP ARE COMPLETED
			System.out.println(stateCapArray[1][i] + " is the state capital of " + stateCapArray[0][i] + ".\n");
		}

		// ASK USER TO INPUT THE PROPER CAPITAL FOR EVERY STATE TO THE BEST OF THEIR
		// ABILITY
		System.out.println(
				"For each state, enter that state's capital. Afterwards you will receive a tally of your correct answers!(Enter '0' at any time to stop the test):\n");
		// COUNTING VARIABLE TO BE USED WITHIN FOR LOOP TO MAINTAIN THE TALLY OF CORRECT
		// ANSWERS
		int total = 0;
		for (int i = 0; i < 50; i++) {
			// ITERATE THROUGH THE ARRAY USING THE ITERATOR CORRESPONDING TO THE 50 COLUMNS
			// OF THE 1ST ROW
			System.out.println("The capital of " + stateCapArray[0][i] + " is:");
			String current = scanner.nextLine();
			// BREAK THE FOR LOOP EARLY IF USER ENTERS 0
			if (current.equals("0")) {
				break;
				// ITERATE THROUGH THE CAPITALS OF THE ARRAY USING THE ITERATOR CORRESPONDING TO
				// THE 50 COLUMNS OF THE 2ND ROW
				// IF THE USER INPUT WAS CORRECT THEN ONE GETS ADDED TO THE COUNTER
			} else if (current.equalsIgnoreCase(stateCapArray[1][i])) {
				// ADD 1 TO THE COUNTER FOR EACH FOR LOOP ITERATION
				total += 1;
			}

		}

		// NOTIFY USER HOW MANY OF THE STATE CAPITALS THEY ANSWERED CORRECTLY
		System.out.println("You correctly answered " + total + " of the state capitals!");

	}

}
//END OF PART ONE OF THE PROGRAM ASSIGNMENT