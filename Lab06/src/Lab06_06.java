import java.util.Calendar;
import java.util.Scanner;

class Player {
	Scanner scan = new Scanner(System.in);
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int game() {
		System.out.print(name + " 시작 <Enter>키 >> ");
		scan.nextLine();
		Calendar time = Calendar.getInstance();
		int currentSec = time.get(Calendar.SECOND);
		System.out.print("	현재 초 시간 = " + currentSec + "\n" + "10초 예상 후 <Enter> 키 >> ");
		scan.nextLine();
		
		// 캘린더 다시 받아오기: 새로 해야 현재초를 받아올 수 있음
		time = Calendar.getInstance();
		int afterSec = time.get(Calendar.SECOND);
		System.out.println("	현재 초 시간 = " + afterSec);
		return getResult(currentSec, afterSec);
	}
	
	public int getResult(int current, int after) {
		return (current <= after)? after - current: after + 60 - current;
	}
}

public class Lab06_06 {
	public void startGame() {
		Player[] p = new Player[2];
		p[0] = new Player("황기태");
		p[1] = new Player("이재문");
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		
		int diff1 = p[0].game();
		int diff2 = p[1].game();
		
		System.out.print(p[0].getName() + "의 결과 " + diff1 + ", " + p[1].getName() + "의 결과 " + diff2);
		if (Math.abs(diff1 - 10) < Math.abs(diff2 - 10))
			System.out.println(", 승자는 " + p[0].getName());
		else if (Math.abs(diff1 - 10) > Math.abs(diff2 - 10))
			System.out.println(", 승자는 " + p[1].getName());
		else
			System.out.println(", 무승부입니다.");
	}
	
	public static void main(String[] args) {
		Lab06_06 game = new Lab06_06();
		game.startGame();
	}

}
