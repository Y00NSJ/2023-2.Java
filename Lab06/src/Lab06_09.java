import java.util.Scanner;

public class Lab06_09 {
	public void rspGame(String name) {
		Scanner scan = new Scanner(System.in);
		String[] rsp = {"가위", "바위", "보", "끝내기"};
		while (true) {
			System.out.print(name + "[가위(1), 바위(2), 보(3), 끝내기(4)] >> ");
			int pInput = scan.nextInt();
			if (pInput == 4) {
				scan.close();
				break;
			}
			int cOutput = (int)(Math.random() * 4);
			System.out.println(name + "(" + rsp[pInput - 1] + ") : 컴퓨터 (" + rsp[cOutput] + ")");
			if ((Math.abs(pInput - 1 - cOutput)) == 2)
				if (pInput - 1 == 2)
					System.out.println("컴퓨터가 이겼습니다.");
				else
					System.out.println(name + "가 이겼습니다.");
			else if (pInput - 1 > cOutput)
				System.out.println(name + "가 이겼습니다.");
			else if (pInput - 1 == cOutput)
				System.out.println("비겼습니다.");
			else
				System.out.println("컴퓨터가 이겼습니다.");
		}
	}
	public static void main(String[] args) {
		Lab06_09 game = new Lab06_09();
		game.rspGame("철수");
	}

}
