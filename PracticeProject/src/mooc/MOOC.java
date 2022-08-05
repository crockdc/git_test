package mooc;

import java.util.*;

public class MOOC {

	public static void main(String[] args) {
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945));
	}

	public static String getDurationString(int minutes, int seconds) {
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		int remainingSeconds = seconds % 60;
		if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
			return (String) "Invalid value";
		}
		return (String) (hours + "h " + remainingMinutes + "m " + remainingSeconds + "s");

	}

	public static String getDurationString(int seconds) {
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		if ((seconds < 0)) {
			return (String) "Invalid value";
		}
		return getDurationString(minutes, remainingSeconds);

	}
}
