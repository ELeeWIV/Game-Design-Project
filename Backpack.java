package game;

import java.util.ArrayList;

public class Backpack {
	protected ArrayList<String> contents;
	protected double credits;
	// credits;

	public Backpack() {
		contents = new ArrayList<String>();
		contents.add("credits: 20");
		contents.add("credits: 30");
		contents.add("credits: 40");
	}

	public void addCredits() {

		for (String item : contents) {
			if (item.contains("credits: ")) {
				String amount = item.substring(9);
				int money = Integer.parseInt(amount);
				double newCredits = money;
				credits += newCredits;
			}
		}
		System.out.println(credits);
	}
	public void addItem(String item) {
		contents.add(item);
	}
	public void showContents() {
		for ( String i : contents) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Backpack backpack = new Backpack();
		backpack.addCredits();
	}
}
