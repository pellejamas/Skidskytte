package skidskytte;

import java.util.Scanner;

public class MainSkidskytte extends Points{ 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Points translator = new Points();		
		System.out.println("Du har 3 alternativ:");
		System.out.println("1. Placering till po?ng.\n2. Po?ng till placering. \n3. Avsluta programet! ");
		int choice = Integer.valueOf(sc.nextLine());
		switch (choice) {
		case 1:
			System.out.println("--> 1. Skriv en po?ng (1-32,34,36,38,40,43,48,54,60) omvandlas till placering: (Anv?nd mellanslag mellan sifforna)");
			String input = sc.nextLine();
			String result = translator.PointsTabToPlace(input);
			System.out.println("--> Omvandling till po?ng blir: \n" + result);
			break;
					
		case 2:
			System.out.println("--> 2. Skriv en placering (1-40) omvandlas till po?ng. (Anv?nd mellanslag mellan siffrorna.)");
			input = sc.nextLine();
			result = translator.PlaceToPointsTab(input);
			System.out.println("--> ?vers?ttning till placering blir:\n" + result);
			break;
			
		case 3:
			System.out.println("Programmet avslutas");
			break;
			
		default:
			System.err.println("\n***FELMEDDELANDE! FEL SIFFRA! (V?LJ 1 2 3)***");
			sc.nextLine();
		}
		sc.close(); // close scanner
		System.exit(0);
	}

}
