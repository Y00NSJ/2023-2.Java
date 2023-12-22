import java.util.Scanner;

public class Lab02_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원의 중심 x1, y1, 반지름 radius 1 >> ");
		int x1 = scan.nextInt(), y1 = scan.nextInt(), r1 = scan.nextInt();
		System.out.print("원의 중심 x2, y2, 반지름 radius 2 >> ");
		int x2 = scan.nextInt(), y2 = scan.nextInt(), r2 = scan.nextInt();
		
		if (Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)) < (r1 + r2))
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
		
		scan.close();
	}

}
