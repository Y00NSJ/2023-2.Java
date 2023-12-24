import java.util.Scanner;

class Grade {
	int math, science, english;
	public Grade(int math, int science, int english) {
		this.math = math; this.science = science; this.english = english;
	}
	public double avarage() {
		return (double)(math + science + english) / 3;
	}
}


public class Lab04_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.avarage());
		
		scan.close();
	}

}
