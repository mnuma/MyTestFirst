package battleship;

import java.util.ArrayList;

public class SimpleDotCom {

	//軍艦の位置を示す
	private ArrayList<String> locationCells = new ArrayList<String>();

	//コンストラクタ
	public SimpleDotCom() {

		boolean flg = true;
		int rnd = (int)(Math.random()*70/10);
		String rndStr = null;

		while(flg){

				rndStr = String.valueOf(rnd);
				this.locationCells.add(rndStr);
				rnd++;

				if(locationCells.size()==3) {
					flg = false;
				}
		}
	}

	public ArrayList<String> getLocationCells() {
		return locationCells;
	}

	public void setLocationCells(ArrayList<String> setCells) {
		this.locationCells = setCells;
	}

	public String checkYourself(String userGuess) {

		String result = null;

		result = "miss"; //初期値はミス推定ハズレを意味する

		//インデックスを指定しArrayListにユーザが推測したセル番号があるかどうか確かめる
		int index = locationCells.indexOf(userGuess); //indexの値が0以上であればユーザの推測したセル番号がリストの中にあるということ

		if(index >= 0){
			locationCells.remove(index);

			if(locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}

		}
		return result;
	}

}
