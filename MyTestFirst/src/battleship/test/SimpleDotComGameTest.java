package battleship.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import battleship.SimpleDotCom;

public class SimpleDotComGameTest {

	@Test
	public void setUp() {

		try {

			SimpleDotCom simpleDotCom = new SimpleDotCom();

			int[] setCells = {1,2,3};
			simpleDotCom.setLocationCells(setCells);

			int[] getcells = simpleDotCom.getLocationCells();
			assertEquals(3, getcells.length);

		}catch(Exception e){

		}

	}

	@Test
	public void setShipLocation() {
		//SimpleDotComGame  = new SimpleDotComGame();
	}

}
