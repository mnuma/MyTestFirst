package battleship.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import battleship.SimpleDotCom;

public class SimpleDotComTest {

	ArrayList<String> result = new ArrayList<String>();

	@Test
	public void constractorTest() {
		SimpleDotCom simpleDotCom = new SimpleDotCom();
		ArrayList<String> list = simpleDotCom.getLocationCells();
		assertEquals(3, list.size());
	}

	@Test
	public void setUp() {

		ArrayList<String> locations = new ArrayList<String>();
		locations.add("1");
		locations.add("2");
		locations.add("3");

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
