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

	//リストを取得する
	public List<String> getList() throws IOException {

		List<String> engineerList = new ArrayList<String>();

		try {

			//ファイルを読み込む
			File file = new File("C:\\tmp\\engineerllist.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufferdReader = new BufferedReader(filereader);
			String list;

			while((list = bufferdReader.readLine())!=null){
                //System.out.println(list);
                engineerList.add(list);
            }

			//BufferdReaderを閉じる
			bufferdReader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return engineerList;

	}

	//リストの数を返す
	public int getListSize() throws IOException {

		int listSize = this.getList().size();

		return listSize;
	}

	//リストをアルファベット順にソートする
	public List<String> getListSort() {

		List<String> engineerList = new ArrayList<String>();

		try {
			engineerList = this.getList();
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
