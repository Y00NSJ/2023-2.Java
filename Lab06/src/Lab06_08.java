import java.util.Scanner;

public class Lab06_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 이력하세요. 빈칸/영어/한글 모두 가능");
		String st = scan.nextLine();
		for (int i = 0; i < st.length(); i++) {
		// 현재 문자열에서 첫글자 가져오기
			String initial = st.substring(0, 1);
		// 나머지 글자 다 가져오기
			String others = st.substring(1);
		// 문자열 = 나머지글자 + 첫글자
			st = others + initial;
		// 문자열 출력
			System.out.println(st);
		}
		scan.close();
	}

}
