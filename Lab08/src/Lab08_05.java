import java.io.*;
import java.util.Scanner;

public class Lab08_05 {
	public static void main(String[] args) {
		BufferedInputStream bin1, bin2 = null;
		File f1, f2;
		byte [] buf1 = new byte [1024];
		byte [] buf2 = new byte [1024];
		try {
			System.out.println("전체 경로명이 아닌 파일명만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
			Scanner scan = new Scanner(System.in);
			System.out.print("첫 번째 파일 >> ");
			f1 = new File(scan.next()); //"C:\\Users\\user\\temp\\test_A.txt"
			System.out.print("두 번째 파일 >> ");
			f2 = new File(scan.next());
			bin1 = new BufferedInputStream(new FileInputStream(f1));
			bin2 = new BufferedInputStream(new FileInputStream(f2));
			int line1 = 0;
			int line2 = 0;
			boolean isEqual = true;
			while ((line1 = bin1.read(buf1)) != -1 || (line2 = bin2.read(buf2)) != -1) {
				if (line1 != line2) {
					System.out.println(line1);
					System.out.println(line2);
					isEqual = false;
					System.out.println("파일이 다릅니다.");
					break;
				}
			}
			if (isEqual == true)
				System.out.println("파일이 같습니다.");
			bin1.close();
			bin2.close();
			scan.close();
		} catch(IOException e) {
			e.getStackTrace();
		}
	}
}
