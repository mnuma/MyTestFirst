package perfectbattleship.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import perfectbattleship.DotCom;

public class DotComTest {

	@Test
	public void setUp() {

		List<String> list = new ArrayList<String>();
		DotCom dotCom = new DotCom();
		list = dotCom.getLocationCells();

	}

	@Test
	public void checkYourselfTest() {

		DotCom dotCom = new DotCom();
		String userGuess = "1";
		String result = dotCom.checkYourself(userGuess);
		assertEquals("miss", result);
	}
}
