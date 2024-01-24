import java.io.*;
import java.util.Scanner;

public class Lab08_02 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			Scanner scan = new Scanner(new FileReader("C:\\Users\\user\\temp\\phone.txt"));
			System.out.println("전화번호부를 출력합니다.");
			while (scan.hasNext()) {
				String word = scan.nextLine();
				System.out.println(word);
			}
			scan.close();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch(IOException e) {
					
				}
		}
	}

}
