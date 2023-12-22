import java.util.Scanner;

public class Lab02_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		int dec	= scan.nextInt();
		int tens = dec / 10, ones = dec % 10;
		
		if (dec > 99 || dec < 1)
			System.out.println("1~99 사이의 정수를 입력하세요.");
		
		if ((tens == 3 || tens == 6 || tens == 9) ^ (ones == 3 || ones == 6 || ones == 9))
			System.out.println("박수짝");
		else if ((tens == 3 || tens == 6 || tens == 9) && (ones == 3 || ones == 6 || ones == 9))
			System.out.println("박수짝짝");
		else
			System.out.println("박수 없음");
		scan.close();
	}

}
