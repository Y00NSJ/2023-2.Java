import java.util.Scanner;
import java.util.Vector;

public class Lab07_01 {
	public static void printMax(Vector<Integer> v) {
		int max = v.get(0);
		for (int i = 1; i < v.size(); i++) {
			if (max < v.get(i))
				max = v.get(i);
		}
		System.out.println("가장 큰 수는 " + max);
	}
	
	public static void printVect(Vector<Integer> v) {
		for (Integer printNum  : v)
			System.out.printf("%d ", printNum);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Vector<Integer> nums = new Vector<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("양의 정수 입력 (빈 칸으로 분리, -1이 입력될 때까지)>> ");
		while (true) {
			int num = scan.nextInt();
			if (num == -1)
				break;
			nums.add(num);
		}
		
		if (nums.size() == 0) {
			System.out.println("수가 하나도 없음");
			scan.close();
			return;
		}
		
		printVect(nums);
		printMax(nums);
		scan.close();
	}

}
