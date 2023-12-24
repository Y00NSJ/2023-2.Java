import java.util.Scanner;

public class Lab03_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] rsp = {"가위", "바위", "보"};
		
		while (true) {
			System.out.print("컴퓨터와 가위비위보 게임을 합니다. \n가위 바위 보! >> ");
			String userInput = scan.next();
			String comOutput = rsp[(int)(Math.random()*4)];
			
			System.out.print("사용자 = " + userInput + ", 컴퓨터 = " + comOutput);
			switch (userInput) {
				case "가위":
					if (comOutput.equals("바위"))
						System.out.println(", 컴퓨터가 이겼습니다. \n");
					else if (comOutput.equals("가위"))
						System.out.println(", 비겼습니다. \n");
					else if (comOutput.equals("보"))
						System.out.println(", 사용자가 이겼습니다. \n");
					break;
				case "바위":
					if (comOutput.equals("바위"))
						System.out.println(", 비겼습니다. \n");
					else if (comOutput.equals("가위"))
						System.out.println(", 사용자가 이겼습니다. \n");
					else if (comOutput.equals("보"))
						System.out.println(", 컴퓨터가 이겼습니다. \n");
					break;
				case "보":
					if (comOutput.equals("바위"))
						System.out.println(", 비겼습니다. \n");
					else if (comOutput.equals("가위"))
						System.out.println(", 컴퓨터가 이겼습니다. \n");
					else if (comOutput.equals("보"))
						System.out.println(", 사용자가 이겼습니다. \n");
					break;
				default:
					System.out.println("가위, 바위, 보 중 하나를 입력해주세요. \n");
				
			}
			if (userInput.equals("그만"))
				scan.close();
				break;
		}
	}

}
