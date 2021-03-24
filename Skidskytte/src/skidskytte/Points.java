package skidskytte;

public class Points {

	private String[] pointsTab = { "60", "54", "48", "43", "40", "38", "36", "34", "32", "31", "30", "29", "28", "27", "26", "25", "24", "23", "22", "21",
								"20", "19",	"18", "17", "16", "15", "14", "13", "12", "11", "10", "9",  "8",  "7",  "6",  "5",  "4",  "3",  "2",  "1" };
	private String[] place = {  "1",  "2",  "3",  "4",  "5",  "6",  "7",  "8",  "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
								"21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34",	"35", "36", "37", "38", "39", "40" };

	public String PointsTabToPlace(String input) {
		// Poäng till placering
		String[] array = input.split(" ");
		String str = "";
		for (int i = 0; i < array.length; i++) {
			for (int index = 0; index < pointsTab.length; index++) {
				if (pointsTab[index].equals(array[i])) {
					str = str + place[index] + " ";				
				}
			}
		}
		return str;
	}

	public String PlaceToPointsTab(String input) {
		// Placering till poäng
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