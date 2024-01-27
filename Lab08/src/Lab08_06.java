import java.io.*;
import java.util.Scanner;

public class Lab08_06 {
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("전체 경로명이 아닌 파일명만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("첫 번째 파일명을 입력하세요 >> ");
		String file1 = scan.next();
		System.out.print("두 번째 파일명을 입력하세요 >> ");
		String file2 = scan.next();
		
		appendFile(file1, file2);
		
		System.out.println("프로젝트 폴더 밑 appended.txt 파일에 저장했습니다.");
		scan.close();
	}
	
	public void appendFile(String f1, String f2) {
		try {
			FileReader fin1 = new FileReader(f1);
			FileReader fin2 = new FileReader(f2);
			FileWriter appendFile = new FileWriter("appended.txt");
			char[] buf1 = new char[1024];
			int f1Count = 0, f2Count = 0, idx1 = -1;
			while (f1Count != -1) {
				f1Count = fin1.read(buf1);
				//System.out.println(f1Count);
				idx1++;
				//fin2.read(buf1, f1Count-1, 1024);
			}
			while (f2Count != -1) {
				f2Count = fin2.read(buf1, idx1, 512);
			}
			for (int i = 0; i < buf1.length; i++) {
				appendFile.write(buf1[i]);
				if (i == idx1 - 1)
					appendFile.write("\r\n");
			}
			fin1.close();
			fin2.close();
			appendFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
