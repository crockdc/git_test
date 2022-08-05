/* PROGRAM:    SORTING & SEARCHING HASHMAP - (STUDY.COM CS201 ASSIGNMENT PART 2)
 * PROGRAMMER: DANIEL CROCKER
 * PURPOSE:    STORE DATA PAIRS IN A MAP USING HASHMAP FUNCTION, DISPLAY THE MAP, USE THE TREEMAP
 * 			   CLASS TO SORT, AND PROMPT USER TO ENTER DATA AND RECEIVE THE PROPER PAIR COUNTERPART.
 * DATE:       07/19/2022 
 -------------------------------------------------------------------------------------*/
package practicePackage2;

import java.util.*;

public class PracticeClass2 {

	public static void main(String[] args) {
		// CREATE NEW HASHMAP NAMED STATESCAPS
		HashMap<String, String> statesCaps = new HashMap<String, String> ();

		// ADD THE KEYS(STATES) AND VALUES(CAPITALS) TO THE HASHMAP
		statesCaps.put("Alabama", "Montgomery");
		statesCaps.put("Alaska", "Juneau");
		statesCaps.put("Arizona", "Phoenix");
		statesCaps.put("Arkansas", "Little Rock");
		statesCaps.put("California", "Sacramento");
		statesCaps.put("Colorado", "Denver");
		statesCaps.put("Connecticut", "Hartford");
		statesCaps.put("Delaware", "Dover");
		statesCaps.put("Florida", "Tallahassee");
		statesCaps.put("Georgia", "Atlanta");
		statesCaps.put("Hawaii", "Honolulu");
		statesCaps.put("Idaho", "Boise");
		statesCaps.put("Illinois", "Springfield");
		statesCaps.put("Indiana", "Indianapolis");
		statesCaps.put("Iowa", "Des Moines");
		statesCaps.put("Kansas", "Topeka");
		statesCaps.put("Kentucky", "Frankfort");
		statesCaps.put("Louisiana", "Baton Rouge");
		statesCaps.put("Maine", "Augusta");
		statesCaps.put("Maryland", "Annapolis");
		statesCaps.put("Massachusetts", "Boston");
		statesCaps.put("Michigan", "Lansing");
		statesCaps.put("Minnesota", "Saint Paul");
		statesCaps.put("Mississippi", "Jackson");
		statesCaps.put("Missouri", "Jefferson City");
		statesCaps.put("Montana", "Helena");
		statesCaps.put("Nebraska", "Lincoln");
		statesCaps.put("Nevada", "Carson City");
		statesCaps.put("New Hampshire", "Concord");
		statesCaps.put("New Jersey", "Trenton");
		statesCaps.put("New Mexico", "Santa Fe");
		statesCaps.put("New York", "Albany");
		statesCaps.put("North Carolina", "Raleigh");
		statesCaps.put("North Dakota", "Bismarck");
		statesCaps.put("Ohio", "Columbus");
		statesCaps.put("Oklahoma", "Oklahoma City");
		statesCaps.put("Oregon", "Salem");
		statesCaps.put("Pennsylvania", "Harrisburg");
		statesCaps.put("Rhode Island", "Providence");
		statesCaps.put("South Carolina", "Columbia");
		statesCaps.put("South Dakota", "Pierre");
		statesCaps.put("Tennessee", "Nashville");
		statesCaps.put("Texas", "Austin");
		statesCaps.put("Utah", "Salt Lake City");
		statesCaps.put("Vermont", "Montpelier");
		statesCaps.put("Virginia", "Richmond");
		statesCaps.put("Washington", "Olympia");
		statesCaps.put("West Virginia", "Charleston");
		statesCaps.put("Wisconsin", "Madison");
		statesCaps.put("Wyoming", "Cheyenne");

		// DISPLAY THE HASHMAP BEFORE AND AFTER SORTING USING A TREEMAP
		// THE TREEMAP SORTS THE KEYS(STATES) ALPHABETICALLY
		Set set = statesCaps.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry entry = (Map.Entry) i.next();
			// DISPLAY THE STATE KEY AND THE CORRESPONDING CAPITAL
			System.out.print(entry.getKey() + " | ");
			System.out.println(entry.getValue());
		}

		// CREATE A NEW TREEMAP OBJECT USING THE HASHMAP STATESCAPS
		Map<String, String> map = new TreeMap<String, String> (statesCaps);
		System.out.println();

		// ITERATE THROUGH THE SORTED TREEMAP USING A WHILE LOOP
		Set set2 = map.entrySet();
		Iterator j = set2.iterator();
		while (j.hasNext()) {
			Map.Entry entry2 = (Map.Entry) j.next();
			// DISPLAY THE STATE KEY AND THE CORRESPONDING CAPITAL
			System.out.print(entry2.getKey() + " | ");
			System.out.println(entry2.getValue());
		}

		// ASK THE USER TO ENTER A STATE THEN OUTPUT THE PROPER CAPITAL
		// CREATE NEW SCANNER OBJECT
		Scanner reader = new Scanner(System.in);
		// INITIALIZE WHILE LOOP STRING VARIABLE
		String cont = "y";
		while (cont != null) {
			System.out.println("\nPlease enter a state. The proper capital will then be displayed:");
			// READ THE USER INPUT USING THE SCANNER OBJECT
			String input = reader.nextLine();
			// IF STATEMENT THAT CHECKS THE USER INPUT VERSUS THE KEY IN THE TREEMAP
			if (map.containsKey(input)) {
				System.out.println("The state capital is " + map.get(input) + ".\n");
			} else {
				System.out.println("Input not valid, try again.\n");
			}
			// BREAK OUT OF THE WHILE LOOP IF USER ENTERS "n"
			System.out.println("Keep playing? (Enter y or n):");
			cont = reader.nextLine();
			if (cont.equals("n")) {
				break;

			}

		}
	}
}

//END OF PART TWO OF THE PROGRAM ASSIGNMENT