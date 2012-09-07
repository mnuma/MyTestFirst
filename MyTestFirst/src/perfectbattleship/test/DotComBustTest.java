package perfectbattleship.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import perfectbattleship.DotCom;
import perfectbattleship.DotComBust;

public class DotComBustTest {

	DotComBust dotComBust = new DotComBust();

	@Test
	public void setUpGameTest() {
		DotComBust dotComBust = new DotComBust();
		dotComBust.setUpGame();
		ArrayList<DotCom> list = dotComBust.getDotComList();

		for(DotCom dot : list) {
			System.out.println(dot.getName());
		}
	}

	@Test
	public void startPlayingTest() {
		dotComBust.setUpGame();

	}

	@Test
	public void checkUserGuessTest() {
		String userGuess = "1";
		dotComBust.checkUserGuess(userGuess);

	}

	@Test
	public void finishGameTest() {

	}

}
