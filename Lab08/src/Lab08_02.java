import java.io.*;

public class Lab08_02 {

	public static void main(String[] args) {
		FileReader fr = null;
		File f = new File("C:\\Users\\user\\temp\\phone.txt");
		try {
			fr = new FileReader(f);
			System.out.println(f.getPath() + "를 출력합니다.");
			int c;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
			fr.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
