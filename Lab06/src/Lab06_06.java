import java.util.Calendar;
import java.util.Scanner;

public class Lab06_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = {"황기태", "이재문"};
		int[] result = new int [name.length];
		
		int currentSec = 0;
		int afterSec = 0;
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " 시작 <Enter>키 >> ");
			scan.nextLine();
			Calendar time = Calendar.getInstance();
			currentSec = time.get(Calendar.SECOND);
			System.out.print("	현재 초 시간 = " + currentSec + "\n" + "10초 예상 후 <Enter> 키 >> ");
			scan.nextLine();
			
			// 캘린더 다시 받아오기: 새로 해야 현재초를 받아올 수 있음
			time = Calendar.getInstance();
			afterSec = time.get(Calendar.SECOND);
			System.out.println("	현재 초 시간 = " + afterSec);
			result[i] = (currentSec <= afterSec)? afterSec - currentSec: afterSec + 60 - currentSec;
			
		}
		
		System.out.print(name[0] + "의 결과 " + result[0] + ", " + name[1] + "의 결과 " + result[1]);
		if (Math.abs(result[0] - 10) < Math.abs(result[1] - 10))
			System.out.println(", 승자는 " + name[0]);
		else if (Math.abs(result[0] - 10) > Math.abs(result[1] - 10))
			System.out.println(", 승자는 " + name[1]);
		else
			System.out.println(", 무승부입니다.");
		scan.close();
	}

}
