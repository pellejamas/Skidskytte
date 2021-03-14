package skidskytte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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

	
}
