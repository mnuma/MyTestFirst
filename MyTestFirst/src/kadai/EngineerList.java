package kadai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EngineerList {

	List<String> engineerList = new ArrayList<String>();

	/**
	 * エンジニアリストを返す
	 * @return エンジニアリスト
	 */
	public List<String> read() throws IOException {

		try {

			//ファイルを読み込む
			File file = new File("C:\\tmp\\engineerllist.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufferdReader = new BufferedReader(filereader);
			String list;

			while((list = bufferdReader.readLine()) != null){
                engineerList.add(list);
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

		try {
			engineerList = this.read();
			Collections.sort(engineerList);

		} catch (IOException e) {
			e.printStackTrace();
		}

//		for (String list : engineerList) {
//			System.out.println(list);
//		}

		return engineerList;
	}

}
