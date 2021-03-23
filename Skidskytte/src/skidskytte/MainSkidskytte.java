package skidskytte;

import java.util.Scanner;

public class MainSkidskytte{ 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Points translator = new Points();		
		System.out.println("Du har 3 alternativ:");
		System.out.println("1. Översätta poäng till placering.\n2. Omvandla placcering till poäng. \n3. Avsluta programet! ");
		int choice = Integer.valueOf(sc.nextLine());
		switch (choice) {
		case 1:
			System.out.println("--> 1. Skriv en placering (1-40) som omvandlas till poäng: (Använd mellanslag mellan orden)");
			int input = sc.nextInt();
			int[] result = translator.PointsTabToPlace(input);
			System.out.println("--> Omvandling till poäng blir: \n" + result[input]);
			
			break;
					
		case 2:
			System.out.println("--> 2. Skriv poäng: (Ha mellanslag mellan varje \"bokstav\") (använd | för mellanrum mellan orden.)");
			input = sc.nextInt();
			result = translator.PlaceToPointsTab(input);
			System.out.println("--> Översättning till placering blir:\n" + result[input]);
			break;
			
		case 3:
			System.out.println("Programmet avslutas");
			break;
			
		default:
			System.err.println("\n***FELMEDDELANDE! FEL SIFFRA! (VÄLJ 1 2 3)***");
			sc.next();
		}
		sc.close(); // close scanner
		System.exit(0);
	}

}
