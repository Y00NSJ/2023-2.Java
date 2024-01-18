import java.util.*;

public class Lab07_02 {
	public static void calGrade(ArrayList<String> a) {
		double sum = 0;
		for (int i = 0; i < a.size(); i++) {
			switch (a.get(i)) {
				case ("A"):
					sum += 4;
					break;
				case ("B"):
					sum += 3;
					break;
				case ("C"):
					sum += 2;
					break;
				case ("D"):
					sum += 1;
					break;
				default:
					sum += 0;
			}
		}
		System.out.printf("평균 : %.2f", sum/a.size());
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("6과목의 학점을 빈 칸으로 분리 입력(A / B / C / D / F) >> ");
		@SuppressWarnings("serial")
		ArrayList<String> grades = new ArrayList<>() {
			{for (int i = 0; i < 6; i++)
				add(scan.next());
			}
		};
		
		if (grades.size() < 6 || grades.size() > 6) {
			System.out.println("6과목의 성적을 입력해야 합니다.");
			scan.close();
			return;
		}
		calGrade(grades);
		scan.close();
	}

}
