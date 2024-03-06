package sec5;

import java.util.ArrayList;
//일반(구현) 클래스
public class Shelf {
	//ArrayList<String> => "kmw", "kim", "woo", "jin",......
	protected ArrayList<String> shelf;	
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	public ArrayList<String> getShelf() {
		return shelf;
	}
	public int getcount() {
		return shelf.size();
	}
}
