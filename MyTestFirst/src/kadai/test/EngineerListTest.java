package kadai.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kadai.EngineerList;
import kadai.dao.Engineer;

import org.junit.Test;
public class EngineerListTest {

	EngineerList engineerList = new EngineerList();

	@Test
	public void readTest() {

		List<Engineer> engineerLists = new ArrayList<Engineer>();

		try {
			engineerLists = engineerList.read();

			for(Engineer engineer : engineerLists) {
				//System.out.println("name: "+engineer.getName()+"  age: "+engineer.getAge());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

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
		assertThat(result,is(3));
	}

	@Test
	public void getListSortTest() {

		List<String> result = null;
		result = engineerList.getListSort();

		//リストをソートする
		assertThat(result.get(0), is("egawa	23"));
	}

	@Test
	public void getNameTest() {

		List<String> result = null;
		result = engineerList.getNameTest();

		assertEquals("shinohara", result.get(0));
	}

	@Test
	public void getAgeTest() {

		List<String> result = null;
		result = engineerList.getAgeTest();

		assertEquals("32" ,result.get(0));
	}

}
