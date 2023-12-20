import java.util.Scanner;

public class Lab02_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요 (1~12) >> ");
		byte month = scan.nextByte();

		switch (month / 3) {
			case (1):
				System.out.println("봄");
				break;
			case (2):
				System.out.println("여름");
				break;
			case (3):
				System.out.println("가을");
				break;
			case (4):
			case (0):
				if (month == 12 || month == 1 || month == 2)
					System.out.println("겨울");
				else
					System.out.println("잘못 입력");
				break;
			default:
				System.out.println("잘못 입력");
		}
		scan.close();
	}

}
