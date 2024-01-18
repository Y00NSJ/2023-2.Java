import java.util.*;

public class Lab07_04 {
	public static void run(Vector<Integer> v) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("강수량 입력 (0 입력 시 종료) >> ");
			int inputRf = scan.nextInt();
			if (inputRf == 0)
				break;
			v.add(inputRf);
			printVect(v);
		}
		scan.close();
	}
	
	public static void printVect(Vector<Integer> v) {
		double rSum = 0;
		for (Integer i : v) {
			System.out.print(i + " ");
			rSum += i;
		}
		System.out.println("\n현재 평균 " + (rSum / v.size()));
	}
	
	public static void main(String[] args) {
		Vector<Integer> rainfall = new Vector<>();
		run(rainfall);
	}

}
