package battleship.test;

import static org.junit.Assert.*;
import org.junit.Test;
import battleship.SimpleDotCom;

public class SimpleDotComTest {

	@Test
	public void constractorTest() {
		SimpleDotCom simpleDotCom = new SimpleDotCom();
		int[] result = simpleDotCom.getLocationCells();
		assertEquals(3, result.length);
	}

	@Test
	public void setUp() {

		int[] locations = {2,3,4};
		SimpleDotCom dot = new SimpleDotCom();

		try {
			dot.setLocationCells(locations);
		}catch(Exception e){
			fail();
		}

		String userGuess = "2";

		String result = dot.checkYourself(userGuess);
		String testResult = "failed";

		assertEquals("hit", result);

		if(result.equals("hit")) {
			testResult = "passed";
		}

		//System.out.println(testResult);
	}

}
