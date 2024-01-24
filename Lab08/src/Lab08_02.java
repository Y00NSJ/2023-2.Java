import java.io.*;

public class Lab08_02 {

	public static void main(String[] args) {
		BufferedReader br = null;
		File f = new File("C:\\Users\\user\\temp\\phone.txt");
		try {
			br = new BufferedReader(new FileReader(f));
			System.out.println(f.getPath() + "를 출력합니다.");
			String c;
			while ((c = br.readLine()) != null) {
				System.out.println(c);
			}
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
