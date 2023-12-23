import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab03_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = 0, star = 0;
		
		while (c == 0) {
			System.out.print("정수를 입력하시오 >> ");
			try {
				star = scan.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("실수나 문자는 입력할 수 없습니다.");
				scan.next();
				continue;
			}
			c++;
		}
		
		for (int i = star; i > 0; i--) {
			for(int j = i; j >0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
