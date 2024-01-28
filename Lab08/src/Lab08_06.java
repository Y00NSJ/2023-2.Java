import java.io.*;
import java.util.Scanner;

public class Lab08_06 {
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		File f = new File("appended.txt");
		FileReader r = null;
		FileWriter w = null;
		System.out.println("전체 경로명이 아닌 파일명만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫 번째 파일명을 입력하세요 >> ");
		String file1 = scan.next();
		System.out.print("두 번째 파일명을 입력하세요 >> ");
		String file2 = scan.next();
		
		try {
			w = new FileWriter(f);
			r = new FileReader(file1);
			appendFile(r, w);
			w.write("\r\n");
			r = new FileReader(file2);
			appendFile(r, w);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로젝트 폴더 밑 appended.txt 파일에 저장했습니다.");
			scan.close();
			if (r != null)
				try {
					r.close();
				} catch (IOException e) {
					
				}
			if (w != null)
				try {
					w.close();
				} catch (IOException e) {
					
				}
		}
		
		
	}
	
	public void appendFile(FileReader f1, FileWriter f2) {
		int i = 0;
		try {
			while ((i = f1.read()) != -1) {
				f2.write((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab08_06 append = new Lab08_06();
		append.run();
	}

}
