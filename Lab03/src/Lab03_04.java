import java.util.*;

public class Lab03_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int isEnd = 0;
		char alphabet = 'a';
		
		while (isEnd == 0) {
			System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
			String inputChar = scan.next();
			if (inputChar.length() > 1) {
				System.out.println("알파벳 하나만 입력해야 합니다!");
				continue;
			}
			else
				alphabet = inputChar.charAt(0);
				if (alphabet < 'a' || alphabet > 'z') {
					System.out.println("소문자 알파벳이 아닙니다.");
					continue;
				}
				isEnd++;
		}
		
		for (char i = alphabet; i >= 'a'; i--) {
			for(char j = 'a'; j <= i; j++)
				System.out.print(j);
			System.out.println();
		}
		scan.close();
	}

}
