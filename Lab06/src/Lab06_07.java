import java.util.*;

public class Lab06_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print(">> ");
			String line = scan.nextLine();
			if (line.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			System.out.println("어절 개수는 " + line.split(" ").length);
		}
		
		scan.close();
	}

}
