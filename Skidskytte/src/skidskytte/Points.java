package skidskytte;

//import java.util.Arrays;
//import java.util.List;

public class Points {

	private int[] pointsTab = { 0, 60, 54, 48, 43, 40, 38, 36, 34, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 
			                    20, 19,	18, 17, 16, 15, 14, 13, 12, 11, 10, 9,  8,  7,  6,  5,  4,  3,  2,  1 };
	private int[] place = {     0, 1, 2,  3,  4,  5,  6,  7,  8,  9,  10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
							    21,22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
	private int[] swap = new int[41];
	private int[] swap2 = new int[41];
	public int[] PointsTabToPlace(int input) {
		// Points till place
		/*int[] strArray = new int [pointsTab.length];
		input.indexOf(input);
		String str = "";
		for (int i = 0; i < strArray.length; i++) {
			for (int index = 0; index < pointsTab.length; index++) {
				if (pointsTab[index] == strArray[i]) {
					//strArray[i] = String.valueOf(pointsTab[i]);
					str = str + place[index] + "";*/
					
					for (int i=0; i<swap.length; i++) {
						swap[i] = pointsTab[i];
						input = place[i];
						//swap[i] = pointsTab[i];
						//pointsTab[i]=place[i];
						//place[i]=swap[i]
					
					//System.out.println("\nAfter swapping: first array: ");
					//for (int i=0; i<swap.length; i++) {
						//System.out.print(swap[i]);
					}
					return swap;
					}

	public int[] PlaceToPointsTab(int input) {
		for (int i=0; i<swap2.length; i++) {
			swap2[i] = pointsTab[i];
			input = pointsTab[i];
		
		//System.out.println(swap2[i]+"\n");
		//System.out.println(place[i]+"\n");
		//System.out.println(pointsTab[i]+"\n");
		
		//System.out.println("\nAfter swapping: first array: ");
		//for (int i=0; i<swap.length; i++) {
			//System.out.print(swap[i]);
		}
		return swap2;
	}
	}

	
		/*// Place till points
		String[] array = input.split(" ");
		String ints = "";
		for (int i = 0; i < array.length; i++) {
			for (int index = 0; index < place.length; index++) {
				if (place[index].equals(array[i])) {
					ints = ints + pointsTab[index] + " ";
				}
			}
		}
		return ints;
	}
}

/*
 * final String[] strings = {"1", "2"}; final int[] ints = new
 * int[strings.length];
 * 
 * for (int j=0; j < strings.length; j++) { ints[j] =
 * Integer.parseInt(strings[j]);
 * 
 * 
 * } /* // Poäng till plats (Char(int) to string) int[] points =
 * input.ToString(); String p = ""; for (int i = 0; i < points.length; i++) {
 * for (int index = 0; index < pointsTab.length; index++) { if (pointsTab[index]
 * == points[i]) { p = p + place[index]; } } } return p; } public String
 * PlaceToPoints(int input) {
 * 
 * 
 * // Plats till poäng (string to (int)char) int[] array = new
 * int[pointsTab.length]; String ch = ""; for (int i = 0; i < array.length; i++)
 * { for (int index = 0; index < place.length; index++) { if
 * (place[index].equals(array[i])) { ch = ch + pointsTab[index]; } } } return
 * ch;
 */
