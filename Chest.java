package game;

import java.util.ArrayList;

/*
 * @author: Emmett Wingfield IV
 * @version 1
 */
public class Chest extends Backpack {
	private ArrayList<String> itemsIn;
	public Chest() {
		itemsIn = new ArrayList<String>();
	}
	public void putInChest(String item) {
		itemsIn.add(item);
		
	}

}
