package game.house.house1;

public class Chest extends game.Backpack{

	public Chest() {
		contents.add("map");
		System.out.println("You now have a map.");
		contents.add("credits: 20");
		System.out.println("You now have another 20 credits.");
	}
}
