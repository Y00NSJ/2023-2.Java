import java.io.*;
import java.util.Scanner;

public class Lab08_05 {
	public static void main(String[] args) {
		FileInputStream bin1, bin2 = null;
		
		System.out.println("전체 경로명이 아닌 파일명만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 파일 >> ");
		String f1 = scan.next(); //"C:\\Users\\user\\temp\\test_A.txt"
		System.out.print("두 번째 파일 >> ");
		String f2 = scan.next();
		
		System.out.println(f1 + "와 " + f2 + "를 비교합니다.");
		
		try {
			bin1 = new FileInputStream(f1);
			bin2 = new FileInputStream(f2);
			
			if (compareFile(bin1, bin2))
				System.out.println("파일이 같습니다.");
			else
				System.out.println("파일이 다릅니다.");
			if (bin1 != null)
				bin1.close();
			if (bin2 != null)
				bin2.close();
			
		} catch(IOException e) {
			e.getStackTrace();
		}
		scan.close();
	}
	private static boolean compareFile(FileInputStream src, FileInputStream dest) throws IOException {
		byte [] buf1 = new byte [1024];
		byte [] buf2 = new byte [1024];
		
		int f1Count = 0, f2Count;
		int count = 0;
		
		while (true) {
			f1Count = src.read(buf1);
			f2Count = dest.read(buf2);
			if (f1Count != f2Count)
				return false;
			if (f1Count == -1)
				break;
			for (int i = 0; i < f1Count; i++)
				if (buf1[i] != buf2[i])
					return false;
			count++;
		}
		System.out.println(count);
		return true;
	}
}
