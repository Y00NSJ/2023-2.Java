import java.util.Scanner;
import java.util.Vector;

public class Lab07_01 {
	public static void main(String[] args) {
		Vector<Integer> nums = new Vector<>();
		Scanner scan = new Scanner(System.in);
		int max = -1;
		int num;
		System.out.print("양의 정수 입력 (빈 칸으로 분리, -1이 입력될 때까지)>> ");
		while (true) {
			num = scan.nextInt();
			if (num == -1)
				break;
			else {
				nums.add(num);
				if (max < num)
					max = num;
			}
		}
		for (Integer printNum  : nums)
			System.out.printf("%d ", printNum);
		System.out.println("\n가장 큰 수는 " + max);
		scan.close();
	}

}
