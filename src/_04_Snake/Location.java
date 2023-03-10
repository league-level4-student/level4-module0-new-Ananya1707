package _04_Snake;

public class Location {
	
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
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
