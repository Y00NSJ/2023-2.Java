import java.util.Scanner;

public class Lab03_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int randomNum = 0;
		System.out.print("정수 몇 개? >> ");
		int inputNum = scan.nextInt();
		
		int [] randomNumArray = new int [inputNum];
		for (int i = 0; i < inputNum; i++) {
			while (true) {
				boolean isEqual = false;		//블록 밖에서 정의하면 무한루프 걸림
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
