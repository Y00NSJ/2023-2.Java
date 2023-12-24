import java.util.Scanner;

class Day {
	private String work;
	public void set(String work) {
		this.work = work;
	}
	public String get() {
		return work;
	}
	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class Lab04_07 {

	public static void main(String[] args) {
		Day [] schedule = new Day [31];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("<이번 달 스케줄 관리 프로그램>");
		while (true) {
			System.out.print("\n할 일 (입력 = 1, 보기 = 2, 끝내기 = 3) >> ");
			int userMenu = scan.nextInt();
			switch (userMenu) {
				case 1:
					System.out.print("날짜 (1 ~ 31) ? >> ");
					int day = scan.nextInt();
					schedule[day] = new Day();
					System.out.print("할 일(빈 칸 없이 입력) >> ");
					schedule[day].set(scan.next());
					break;
				case 2:
					System.out.print("날짜 (1 ~ 31) ? >> ");
					int searchday = scan.nextInt();
					System.out.print(searchday + "일의 할 일은");
					schedule[searchday].show(); 
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("1, 2, 3 중 하나를 입력하세요.");
			}
			if (userMenu == 3)
				break;
		}
	}

}
