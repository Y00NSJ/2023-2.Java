import java.util.Calendar;
import java.util.Scanner;

public class Lab06_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = {"황기태", "이재문"};
		int[] result = new int [name.length];
		Calendar time = Calendar.getInstance();
		int currentSec = 0;
		int afterSec = 0;
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " 시작 <Enter>키 >> ");
			scan.nextLine();
			currentSec = time.get(Calendar.SECOND);
			System.out.print("현재 초 시간 = " + currentSec + "\n10초 예상 후 <Enter> 키 >> ");
			scan.nextLine();
			afterSec = time.get(Calendar.SECOND);
			System.out.print("현재 초 시간 = " + afterSec);
			result[i] = (currentSec < afterSec)? afterSec - currentSec: Math.abs(currentSec - (afterSec + 10));
			
		}
		
		System.out.println(name[0] + "의 결과 " + result[0] + ", " + name[1] + "의 결과 " + result[1]);
		if (result[0] > result [1])
			System.out.println(", 승자는 " + name[0]);
		else if (result[0] < result [1])
			System.out.println(", 승자는 " + name[1]);
		else
			System.out.println(", 무승부입니다.");
		scan.close();
	}

}
