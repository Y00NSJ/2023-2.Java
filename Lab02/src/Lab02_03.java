import java.util.Scanner;

public class Lab02_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int inputSum = scan.nextInt();
		int change;
		
		String bill[] = {"오만원권 ", "만원권 ", "천원권 ", "백원 ", "오십원 ", "십원 ", "일원 "};
		int amount[] = {50000, 10000, 1000, 100, 50, 10, 1};
		
		for (int i = 0; i < 7; i++) {
			change = inputSum / amount[i];
			inputSum %= amount[i];
			if (i < 3)
				System.out.println(bill[i] + change + "매");
			else
				System.out.println(bill[i] + change + "개");
		}
		scan.close();
		
	}

}
