package kadai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kadai.dao.Engineer;

public class EngineerList {

	List<Engineer> engineerList = new ArrayList<Engineer>();

	/**
	 * エンジニアリストをEngineer型で返す
	 * @return エンジニアリスト
	 */
	public List<Engineer> read() throws IOException {

		try {

			//ファイルを読み込む
			File file = new File("C:\\tmp\\engineerllist2.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufferdReader = new BufferedReader(filereader);
			String list;
			String[] str = null;

			while((list = bufferdReader.readLine()) != null){

				Engineer engineer = new Engineer();

				str = list.split("\t",0);
				engineer.setName(str[0]);
				engineer.setAge(str[1]);

				engineerList.add(engineer);
            }

			//BufferdReaderを閉じる
			bufferdReader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return engineerList;
	}

	/**
	 * エンジニアリストの人数を返す
	 * @return エンジニアの人数
	 * @throws IOException
	 */
	public int getListSize() throws IOException {

		int listSize = this.read().size();
		return listSize;
	}

	/**
	 * エンジニアリストをソートしたリストを返す
	 * @return アルファベット順でソート済みのリスト
	 */
	public List<String> getListSort() {

		List<String> sortList = new ArrayList<String>();
		String s = null;

		try {
			engineerList = read();

			for (Engineer engineer : engineerList) {
				s = engineer.getName() + "\t" + engineer.getAge();
				//System.out.println(s);
				sortList.add(s);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		Collections.sort(sortList);

		return sortList;
	}

	/**
	 * エンジニアリストの名前だけ返す
	 * @return 名前のリスト
	 */
	public List<String> getNameTest() {

		List<String> list = new ArrayList<String>();

		try {
			engineerList = this.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for(Engineer engineer : engineerList) {
			list.add(engineer.getName());
		}

		return list;
	}

	/**
	 * エンジニアリストの年齢だけ返す
	 * @return 年齢のリスト
	 */
	public List<String> getAgeTest() {

		List<String> list = new ArrayList<String>();

		try {
			engineerList = this.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for(Engineer engineer : engineerList) {
			list.add(engineer.getAge());
		}

		return list;
	}

}
