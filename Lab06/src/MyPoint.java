
public class MyPoint {
	private int x, y;
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(MyPoint p) {
		if (this.x == p.x && this.y == p.y)
			return true;
		else
			return false;
	}
	public String toString() {
		return ("(" + x + "," + y + ")");
	}
}
