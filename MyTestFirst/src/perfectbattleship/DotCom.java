package perfectbattleship;

import java.util.ArrayList;
import java.util.List;

public class DotCom {

	private List<String> cellLocations = new ArrayList<String>();

	public DotCom() {
		// TODO インスタンス時にランダムな3つの数を返す
		this.cellLocations.add("a");
		this.cellLocations.add("a");
		this.cellLocations.add("a");
	}

	public List<String> getCellLocations() {
		// TODO
		return cellLocations;

	}



}
