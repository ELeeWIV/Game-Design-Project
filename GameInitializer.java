package game;

import game.Backpack;

public class GameInitializer {
	protected int xPos, yPos;
	
	public GameInitializer() {
		xPos = 25;
		yPos = 25;
	}
	
	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GameInitializer gmntlzr = new GameInitializer();
	}

}
