package skidskytte;

import java.util.Scanner;

public class MainSkidskytte extends Points{ 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Points translator = new Points();		
		System.out.println("Du har 3 alternativ:");
		System.out.println("1. �vers�tta po�ng till placering.\n2. Omvandla placcering till po�ng. \n3. Avsluta programet! ");
		int choice = Integer.valueOf(sc.nextLine());
		switch (choice) {
		case 1:
			System.out.println("--> 1. Skriv en po�ng (1-32,34,36,38,40,43,48,54,60) som omvandlas till placering: (Anv�nd mellanslag mellan orden)");
			String input = sc.nextLine();
			String result = translator.PointsTabToPlace(input);
			System.out.println("--> Omvandling till po�ng blir: \n" + result);
			break;
					
		case 2:
			System.out.println("--> 2. Skriv en placering (1-40) (Ha mellanslag mellan varje \"bokstav\") (anv�nd | f�r mellanrum mellan orden.)");
			input = sc.nextLine();
			result = translator.PlaceToPointsTab(input);
			System.out.println("--> �vers�ttning till placering blir:\n" + result);
			break;
			
		case 3:
			System.out.println("Programmet avslutas");
			break;
			
		default:
			System.err.println("\n***FELMEDDELANDE! FEL SIFFRA! (V�LJ 1 2 3)***");
			sc.nextLine();
		}
		sc.close(); // close scanner
		System.exit(0);
	}

}
