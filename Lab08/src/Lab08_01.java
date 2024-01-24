import java.io.*;
import java.util.Scanner;

public class Lab08_01 {
	public static void main(String[] args) {
		FileWriter fin = null;
		File f = new File("C:\\Users\\user\\temp\\phone.txt");
		
		try {
			fin = new FileWriter(f);
			Scanner scan = new Scanner(System.in);
			
			System.out.println("전화번호 입력 프로그램입니다.");
			while (true) {
				System.out.print("이름 전화번호 >> ");
				String line = scan.nextLine();
				if (line.equals("그만"))
					break;
				fin.write(line + "\r\n");
			}
			System.out.println(f.getPath() + "에 저장하였습니다.");
			scan.close();
			fin.close();
		}
		catch (IOException e) {
			e.printStackTrace(); //에러 발생 근원 찾아 단계별 출력
			System.out.println("작성에 실패하였습니다.");
		}
	}
}
