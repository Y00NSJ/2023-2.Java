import java.util.Scanner;

class Circle {
	double x, y;
	int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("( " + x + " , " + y + " ) " + radius);
	}
	public int getArea() {
		return radius * radius;
	}
}

public class Lab04_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle [] c = new Circle [3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int radius = scan.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		int max = 0;
		int maxidx = 0;
		for (int i = 0; i < c.length; i++) {
			c[i].show();
			if (c[i].getArea() > max) {
				max = c[i].getArea();
				maxidx = i;
			}
		}
		System.out.println("가장 면적이 큰 원은 " + c[maxidx].show() + (" 이며, 면적은 " + c[maxidx].getArea() + "입니다.");
		scan.close();
	}

}
