import java.util.*;

public class Lab07_02 {
	public static void calGrade(ArrayList<String> a) {
		int[] grade = new int[6];
		int sum = 0;
		for (int i = 0; i < grade.length; i++) {
			switch (a.get(i)) {
				case ("A"):
					grade[i] = 4;
					break;
				case ("B"):
					grade[i] = 3;
					break;
				case ("C"):
					grade[i] = 2;
					break;
				case ("D"):
					grade[i] = 1;
					break;
				default:
					grade[i] = 0;
			}
			sum += grade[i];
		}
		System.out.println((double)(sum)/6);
	}
	
	public static void main(String[] args) {
		ArrayList<String> grades = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("6과목의 학점을 빈 칸으로 분리 입력(A / B / C / D / F) >> ");
		for (int i = 0; i < 6; i++) {
			grades.add(scan.next());
		}
		if (grades.size() < 6 || grades.size() > 6) {
			System.out.println("6과목의 성적을 입력해야 합니다.");
			scan.close();
			return;
		}
		calGrade(grades);
		scan.close();
	}

}
