System.out.println("\nPlease enter a state. The proper capital will then be displayed:");
			String input = reader.nextLine();
			if (map.containsKey(input)) {
				System.out.println("The capital is " + map.get(input));
				System.out.println("Keep playing? (Enter y or n)");
				String cont = reader.nextLine();
				if (cont == "n") {
					endLoop = false;
					continue;