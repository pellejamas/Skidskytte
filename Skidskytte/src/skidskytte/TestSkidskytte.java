package skidskytte;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestSkidskytte {

	@Test
	public void test01Sprint() {
		//Arrange
		int input = 1;
		
		//Act
		Skidskytte sprint = new Skidskytte();
		int output = sprint.sprint(input);
		
		//Assert
		assertEquals(1,output);	
	}
	@Test
	public void test02Jaktstart() {
		//Arrange
		int input = 2;
		
		//Act
		Skidskytte Jaktstart = new Skidskytte();
		int output = Jaktstart.jaktstart(input);
		
		//Assert
		assertEquals(2,output);	
	}
	@Test
	public void test03Distans() {
		//Arrange
		int input = 3;
		
		//Act
		Skidskytte Distans = new Skidskytte();
		int output = Distans.distans(input);
		
		//Assert
		assertEquals(3,output);	
	}
	
	@Test
	public void test04Massstart() {
		//Arrange
		int input = 4;
		
		//Act
		Skidskytte Masstart = new Skidskytte();
		int output = Masstart.masstart(input);
		
		//Assert
		assertEquals(4,output);	
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "60 54" })
	public void test05points(String input) {
		//Arrange
		//Act
		Points object= new Points();
		String output = object.PointsTabToPlace(input);
		
		//Assert
		assertEquals("1 2 ",output);	
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"1 2 3 4 5 6 7 8 9 10"})
	public void test06place(String input) {
		//Arrange
		//Act
		Points object = new Points();
		String output = object.PlaceToPointsTab(input);
		
		//Assert
		assertEquals("60 54 48 43 40 38 36 34 32 31 ",output);	
	}
	
}
