import java.util.Scanner;

public class Lab06_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 이력하세요. 빈칸/영어/한글 모두 가능");
		String st = scan.nextLine();
		for (int i = 0; i < st.length(); i++) {
			System.out.println(st.substring(i+1,st.length()) + st.substring(0,i+1));
		}
		scan.close();
	}

}
