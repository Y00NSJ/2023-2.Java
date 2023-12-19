import java.util.Scanner;

public class Lab02_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int inputSum = scan.nextInt();
		
		int bill = inputSum / 50000;
		inputSum %= 50000;
		System.out.println("오만원권 " + bill + "매");
		bill = inputSum / 10000;
		inputSum %= 10000;
		System.out.println("만원권 " + bill + "매");
		bill = inputSum / 1000;
		inputSum %= 1000;
		System.out.println("천원권 " + bill + "매");
		bill = inputSum / 100;
		inputSum %= 100;
		System.out.println("백원 " + bill +"개");
		bill = inputSum / 50;
		inputSum %= 50;
		System.out.println("오십원 " + bill +"개");
		bill = inputSum / 10;
		inputSum %= 10;
		System.out.println("십원 " + bill +"개");
		System.out.println("일원 " + inputSum +"개");
		
	}

}
