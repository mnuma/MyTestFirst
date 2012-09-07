package perfectbattleship;

import java.util.ArrayList;

import perfectbattleship.util.GameHelper;

/**
 * ゲームのすべての処理を進めるクラス。
 * ※仮コード
 */
public class DotComBust {

	//helper
	private GameHelper gameHelper;

	//DotComオブジェクトを格納するArrayListのインスタンス
	private ArrayList<String> list = new ArrayList<String>();

	//ユーザの推測の数を記録する
	private int numOfGuess;

	public static void main(String[] args) {

	}

	//名前と配置を決定
	void setUpGame() {

		//DitComオブジェクトを作成し名前を付ける

		//名前の指定

		//ArrayListへの追加 DotCOmオブジェくトをdotComListに追加する

			//繰り返し処理

			//メソッドの呼び出し

			//配置の指定

	}

	//ユーザに推測したセル番号の入力を求める
	void startPlaying() {

		//繰り返し処理 DotComオブジェクトが1つでも存在していたら、同じ処理を繰り返す

			//データ取得 ユーザ入力データ取得

			//確認 checkUserGuess() ユーザの推測が正しいかの確認
	}

	//その時点で残っているDotComオブジェクトについてcheckYourselfメソッドを呼び出す
	void checkUserGuess() {

		//ユーザの推測が当たってるかどうかの確認

		//インクリメント

		//値の設定

		//繰り返し処理

			//確認
			//値の設定
			//if文
			//削除

		//表示
	}

	//すべてのDotComオブジェクトを削除するために何回セル番号を入力したか
	void finishGame() {
		//表示 ゲーム終了メッセージ
			//if文 ユーザの推測数
				//表示 評価高い
			//else文
				//表示 評価低い

	}

}
