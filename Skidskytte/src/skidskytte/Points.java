package skidskytte;

//import java.util.Arrays;
//import java.util.List;

public class Points {

	private int[] pointsTab = { 0, 60, 54, 48, 43, 40, 38, 36, 34, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20,
								19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
	private int[] place = { 	0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
								21, 22, 23, 24,	25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
	private int[] swap = new int[41];
	private int[] swap2 = new int[41];

	public int[] PointsTabToPlace(int input) {

		for (int i = 0; i < swap.length; i++) {
			swap[i] = pointsTab[i];
			input = place[i];
		}
		return swap;
	}

	public int[] PlaceToPointsTab(int input) {
		for (int i = 0; i < swap2.length; i++) 
			swap2[i] = place[i];
			input = pointsTab[input];
			//input = pointsTab[i];
		//}
			return swap2;
		}	
}
