import java.io.*;

public class Lab08_07 {

	public void copyFile(File f) {
		BufferedInputStream fin = null;
		BufferedOutputStream fout = null;
		long fSize = f.length();
		int status = (int)(fSize / 10);
		try {
			fin = new BufferedInputStream(new FileInputStream(f), status);
			fout = new BufferedOutputStream(new FileOutputStream(f + "_copied.png"), status);
			
			int c;
			int statAmount = 0;
			while ((c = fin.read()) != -1) {
				fout.write((char)c);
				statAmount++;
				if (statAmount % status == 0)
					System.out.print("*");
			}
			
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
	
	public void run() {
		System.out.println("a.jpg를 복사합니다." + "\n" + "10%마다 *를 출력합니다.");
		File alien = new File("a.png");
		copyFile(alien);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab08_07 copyFile = new Lab08_07();
		copyFile.run();
	}

}
