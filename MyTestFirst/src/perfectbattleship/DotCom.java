package perfectbattleship;

import java.util.ArrayList;
import java.util.List;

public class DotCom {

	private ArrayList<String> locationCells = new ArrayList<String>();
	private String name;

	public void setLocationCells (ArrayList<String> newLocation) {
		locationCells = newLocation;
	}

	public ArrayList<String> getLocationCells() {
		// TODO
		return locationCells;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String checkYourself (String userGuess) {
		// TODO 値のチェック
		String result = "miss";
		int index = locationCells.indexOf(userGuess);

		if(index >= 0) {
			//リストから取り除く
			locationCells.remove(index);
				if(locationCells.isEmpty()) {
					result = "kill";
					System.out.println("Ouch! You sunk" + name );
				} else {
					result = "hit";
				}
		}
		return result;
	}
}
