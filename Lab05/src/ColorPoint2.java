
public class ColorPoint2 extends Point{
	private String color;
	
	public ColorPoint2(int x, int y) {
		super(x, y);
		color = "BLACK";
	}
	
	public ColorPoint2() {
		super(0, 0);
		color = "BLACK";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		move(x, y);
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return (getColor() + "색의 " + "(" + getX() + "," + getY() + ")의 점");
	}
	
	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint2 cp = new ColorPoint2(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

}
