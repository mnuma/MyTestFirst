package battleship;

public class SimpleDotCom {

	//軍艦の位置を示す
	private int[] locationCells;
	private int numOfHits = 0;

	//コンストラクタ
	public SimpleDotCom() {

		boolean flg = true;
		int[] setCells = new int[3];

		while(flg){

			int rnd = (int)(Math.random()*70/10);

			if(rnd<=4){
				for(int i = 0;i <= 2;i++){
					setCells[i] = rnd;
					rnd++;
				}

				flg = false;
			}

		}

		this.locationCells = setCells;

//		for(int i : locationCells) {
//			System.out.println(i);
//		}

	}

	public int[] getLocationCells() {
		return locationCells;
	}

	public void setLocationCells(int[] locationCells) {
		this.locationCells = locationCells;
	}

	public int getNumOfHits() {
		return numOfHits;
	}

	public void setNumOfHits(int numOfHits) {
		this.numOfHits = numOfHits;
	}

	public String checkYourself(String userGuess) {

		int guess = Integer.parseInt(userGuess); //ユーザが入力した値を数値に変換
		String result = "miss"; //初期値はミス推定ハズレを意味する

		//locationCellsの中身すべてについて処理する
		for(int cell : locationCells) {

			//System.out.println(cell);
			if(guess==cell) {
				result = "hit";
				numOfHits++; //推測が一致した回数を表す値を1増やす

					if(numOfHits==locationCells.length) { //正解が達したかどうか
						result = "kill";
					}

				break;//ループを抜ける
			}
		}
		return result;
	}

}
