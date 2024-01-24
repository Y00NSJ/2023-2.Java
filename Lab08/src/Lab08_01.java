import java.io.*;
import java.util.Scanner;

public class Lab08_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileWriter fin;
		System.out.println("전화번호 입력 프로그램입니다.");
		try {
			fin = new FileWriter("C:\\Users\\user\\temp\\phone.txt");
			while (true) {
				System.out.print("이름 전화번호 >> ");
				String line = scan.nextLine();
				if (line.equals("그만"))
					break;
				fin.write(line);
			}
			scan.close();
			fin.close();
			System.out.println("저장하였습니다.");
		}
		catch (IOException e) {
			System.out.println("작성에 실패하였습니다.");
		}
	}
}
