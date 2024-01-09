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
	Scanner scan = new Scanner(System.in);
	Random rd = new Random();
	int [] rdNum = new int[3];
	Person [] twoP = new Person [2];
	
	public void setting() {	//
		for (int i = 0; i < twoP.length; i++) {
			System.out.print((i+1) + "번째 선수 이름 >> ");
			twoP[i] = new Person(scan.nextLine());
		}
	}
	
	
	public void game() {
		setting();
		boolean isEnd = false;	//
		while (true) {
			for (int i = 0; i < twoP.length; i++) {
				System.out.print("[" + twoP[i].getName() + "] : <Enter>");
				scan.nextLine();
				System.out.print("\t");
				
				int rdNum1 = rd.nextInt(3) + 1;
				int rdNum2 = rd.nextInt(3) + 1;
				int rdNum3 = rd.nextInt(3) + 1;
				System.out.print(rdNum1 + "   " + rdNum2 + "   " + rdNum3 + "   ");
				
				if (rdNum1 == rdNum2 && rdNum2 == rdNum3) {
					System.out.println(twoP[i].getName() + "님이 이겼습니다!");
					isEnd = true;
					break;
				}
				else
					System.out.println("아쉽군요!");
			}
			if (isEnd) {
				scan.close();
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Lab06_10 gamblingGame = new Lab06_10();
		gamblingGame.game();
	}

}
