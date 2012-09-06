package battleship.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import battleship.SimpleDotCom;

public class SimpleDotComGameTest {

	@Test
	public void setUp() {

		try {

			SimpleDotCom simpleDotCom = new SimpleDotCom();

			ArrayList<String> setCells = new ArrayList<String>();
			setCells.add("1");
			setCells.add("2");
			setCells.add("3");

			simpleDotCom.setLocationCells(setCells);

			ArrayList<String> getcells = simpleDotCom.getLocationCells();
			assertEquals(3, getcells.size());

		}catch(Exception e){

		}

	}

}
