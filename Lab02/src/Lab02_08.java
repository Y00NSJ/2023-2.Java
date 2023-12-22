import java.util.Scanner;

public class Lab02_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x1, y1 입력 >> ");
		int x1 = scan.nextInt(), y1 = scan.nextInt();
		System.out.print("x2, y2 입력 >> ");
		int x2 = scan.nextInt(), y2 = scan.nextInt();
		
		if ((x1 >= 100 && x1 <= 200 && y1 >= 100 && y1 <= 200) ||(x2 >= 100 && x2 <= 200 && y2 >= 100 && y2 <= 200))
			System.out.println("충돌 발생");
		else
			System.out.println("충돌 없음");
		
		scan.close();
	}

}
