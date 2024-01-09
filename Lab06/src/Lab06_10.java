import java.util.*;

class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

public class Lab06_10 {
	
	public void game() {
		Scanner scan = new Scanner(System.in);
		Random rd = new Random();
		int [] rdNum = new int[3];
		boolean isEnd = false;
		Person [] twoP = new Person [2];
		for (int i = 0; i < twoP.length; i++) {
			System.out.print((i+1) + "번째 선수 이름 >> ");
			twoP[i] = new Person(scan.nextLine());
		}
		
		while (true) {
			for (int i = 0; i < twoP.length; i++) {
				System.out.print("[" + twoP[i].getName() + "] : <Enter>");
				scan.nextLine();
				System.out.print("\t");
				for (int j = 0; j < rdNum.length; j++) {
					rdNum[j] = rd.nextInt(3) + 1;
					System.out.print(rdNum[j] + "   ");
				}
				if (rdNum[0] == rdNum[1] && rdNum[1] == rdNum[2]) {
					System.out.println(twoP[i].getName() + "님이 이겼습니다!");
					scan.close();
					isEnd = true;
					break;
				}
				else
					System.out.println("아쉽군요!");
			}
			if (isEnd)
				break;
		}
	}
	
	public static void main(String[] args) {
		Lab06_10 gamblingGame = new Lab06_10();
		gamblingGame.game();
	}

}
