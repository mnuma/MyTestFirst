package perfectbattleship;

import java.util.ArrayList;

import perfectbattleship.util.GameHelper;

/**
 * ゲームのすべての処理を進めるクラス。
 * ※リアルコード
 */
public class DotComBust {

	//helper
	private GameHelper helper = new GameHelper();

	//DotComオブジェクトを格納するArrayListのインスタンス
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();

	//ユーザの推測の数を記録する
	private int numOfGuess = 0;

	public ArrayList<DotCom> getDotComList() {
		return this.dotComsList;
	}

	public int getNumOfGuess() {
		return numOfGuess;
	}

	public void setNumOfGuess(int numOfGuess) {
		this.numOfGuess = numOfGuess;
	}

	//名前と配置を決定
	public void setUpGame() {

		//DotComオブジェクトを作成する 名前を付ける * 3
		DotCom one = new DotCom();
		one.setName("Pets.com");

		DotCom two = new DotCom();
		two.setName("eToy.com");

		DotCom three = new DotCom();
		three.setName("Go2.com");

		//ArrayListへの追加 DotoOmオブジェくトをdotComListに追加する
		this.dotComsList.add(one);
		this.dotComsList.add(two);
		this.dotComsList.add(three);

		//繰り返し処理
		for(DotCom dotComToSet : dotComsList) {

			//セルの位置を設定
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}

	}

	//ユーザに推測したセル番号の入力を求める
	public void startPlaying() {

		//繰り返し処理 DotComオブジェクトが1つでも存在していたら、同じ処理を繰り返す
		while(!dotComsList.isEmpty()) {

			//データ取得 ユーザ入力データ取得
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
	}

	//その時点で残っているDotComオブジェクトについてcheckYourselfメソッドを呼び出す
	public void checkUserGuess(String userGuess) {

		numOfGuess++;
		String result = "miss";

		//ユーザの推測が当たってるかどうかの確認
		for (DotCom dotComToTest : dotComsList ) {
			result = dotComToTest.checkYourself(userGuess);

			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComsList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}

	//すべてのDotComオブジェクトを削除するために何回セル番号を入力したか
	public void finishGame() {
		//表示 ゲーム終了メッセージ
		System.out.println("All Doct are dead");
			//if文 ユーザの推測数
		if(numOfGuess <= 18) {
			//評価高い
			System.out.println("Took you long enough" + numOfGuess + "guess");
		}else{
			//評価低い
			System.out.println("Took you long enough" + numOfGuess + "guess");
		}

	}

	/**
	 *
	 * @param args
	 * mainメソッド
	 */
	public static void main(String[] args) {
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}

}
