package perfectbattleship.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {

	//グリッドサイズの設定
	private int gridlength = 7;
	private int gridSize = 49;

	//グリッドサイズ分の配列を作る
	private int[] grid = new int[gridSize];
	private int comCount = 0;

	public ArrayList<String> placeDotCom(int i) {
		// TODO ランダムな数を入力
		ArrayList<String> alphaCells = new ArrayList<String>();
		String[] alphacoords = new String [i];
		int location = 0;

		location = (int) (Math.random() * gridSize);
		return null;
	}

	/**
	 * ユーザに入力させるメソッド
	 * @param string
	 * @return
	 */
	public String getUserInput(String string) {
		String inputLine = null;
		System.out.println(string + "");

		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		try {
			inputLine = is.readLine();
			//入力チェック
			if (inputLine.length() == 0) return null;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputLine.toLowerCase();
	}

}
