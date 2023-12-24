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

class MonthSchedule {
	int mDays;
	Day [] schedule;
	Scanner scan = new Scanner(System.in);
	
	public MonthSchedule(int mDays) {
		this.mDays = mDays;
		schedule = new Day[mDays];
		for (int i = 0; i < schedule.length; i++) {
			schedule[i] = new Day();
		}
	}
	
	public void run() {
		System.out.println("<이번 달 스케줄 관리 프로그램>");
		while (true) {
			System.out.print("\n할 일 (입력 = 1, 보기 = 2, 끝내기 = 3) >> ");
			int userMenu = scan.nextInt();
			switch (userMenu) {
				case 1:
					this.input();
					break;
				case 2:
					this.view();
					break;
				case 3:
					this.finish();
					break;
				default:
					System.out.println("1, 2, 3 중 하나를 입력하세요.");
			}
			if (userMenu == 3)
				break;
		}
	}
		
	public void input() {
		System.out.print("날짜 (1 ~ 31) ? >> ");
		int day = scan.nextInt();
		if (day < 0 || day > mDays) {
			System.out.println("날짜를 잘못 입력하였습니다!");
			return;
		}
		System.out.print("할 일(빈 칸 없이 입력) >> ");
		schedule[day - 1].set(scan.next());
	}
	
	public void view() {
		System.out.print("날짜 (1 ~ 31) ? >> ");
		int searchday = scan.nextInt();
		System.out.print(searchday + "일의 할 일은 ");
		schedule[searchday - 1].show();
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
}

public class Lab04_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("몇 월의 계획을 세우시겠습니까? (숫자로 입력) >> ");
			int month = scan.nextInt();
			switch (month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					MonthSchedule oddMonth = new MonthSchedule(31);
					oddMonth.run();
					scan.close();
					break;
				case 4: case 6: case 9: case 11:
					MonthSchedule evenMonth = new MonthSchedule(30);
					evenMonth.run();
					scan.close();
					break;
				case 2:
					MonthSchedule feb = new MonthSchedule(28);
					feb.run();
					scan.close();
					break;
				default:
					System.out.println("1~12 사이의 숫자를 입력하세요.");
			}
			if (month < 1 || month > 12)
				continue;
			else
				break;
		}
	}

}
