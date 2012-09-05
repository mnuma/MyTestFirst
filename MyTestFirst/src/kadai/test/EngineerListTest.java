package kadai.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.List;
import kadai.EngineerList;
import org.junit.Test;
public class EngineerListTest {

	EngineerList engineerList = new EngineerList();

	@Test
	public void getListSizeTest() {

		int result = 0;

		try {
			result = engineerList.getListSize();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}

		//リストから得られたエンジニアの人数
		//assertEquals(3, result);
		assertThat(result,is(3));
	}

	@Test
	public void getListSortTest() {

		List<String> result = null;
		result = engineerList.getListSort();

		//リストをソートする
		//assertEquals("egawa", result.get(0));
		assertThat(result.get(0), is("egawa"));
	}

}
