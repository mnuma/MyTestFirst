package perfectbattleship.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import perfectbattleship.DotCom;
import perfectbattleship.DotComBust;

public class DotComBustTest {

	@Test
	public void setUpTest() {

		//インスタンス化
		DotComBust dotComBust = new DotComBust();
		//インスタンス時にランダムな3つの数字が入る
		ArrayList<String> dotComLocation= dotComBust.getCellLocation();
		assertEquals(3, dotComLocation.size());
	}

}
