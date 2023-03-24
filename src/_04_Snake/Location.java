package _04_Snake;

public class Location {
	
	private int x;
	private int y;
	
	public Location(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;

	}
	
	public int getX() {
		return x;
	}

	
	public int getY() {
		return y;
	}
	
	public boolean equals(Location l) {
		if(l.getX() == x && l.getY() == y) {
			return true;
		}
		else {
			return false;
		}
	}
}

enum Direction {

	UP, DOWN, LEFT, RIGHT;
	
}
