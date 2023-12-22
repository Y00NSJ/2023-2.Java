import java.util.Scanner;

public class Lab02_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 자리 수 정수 입력 (10~99) >> ");
		int dec = scan.nextInt();
		
		if (dec / 10 == dec % 10)
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		else if (dec < 10 || dec >99)
			System.out.println("두 자리수 정수를 입력하세요.");
		else 
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		
		scan.close();
	}

}
