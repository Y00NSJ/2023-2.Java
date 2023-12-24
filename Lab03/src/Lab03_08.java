import java.util.Scanner;

public class Lab03_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int randomNum = 0;
		System.out.print("정수 몇 개? >> ");
		int inputNum = scan.nextInt();
		boolean isEqual = false;
		
		int [] randomNumArray = new int [inputNum];
		for (int i = 0; i < inputNum; i++) {
			while (true) {
				randomNum = (int)(Math.random() * 100) + 1;
				for (int j = 0; j < inputNum; j++) {
					if (randomNum == randomNumArray[j])
						isEqual = true;
				}
				if (isEqual == false)
					break;
			}
			randomNumArray[i] = randomNum;
		}
		
		for (int i = 0; i < inputNum; i++) {
			System.out.print(randomNumArray[i] + "\t");
			if ((i + 1) % 10 == 0)
				System.out.println(i);
		}
		scan.close();
	}

}
