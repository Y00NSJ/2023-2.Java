import java.io.*;

public class Lab08_07 {

	public void copyFile(File f) {
		BufferedInputStream fin = null;
		BufferedOutputStream fout = null;
		try {
			fin = new BufferedInputStream(new FileInputStream(f));
			fout = new BufferedOutputStream(new FileOutputStream(f + "_copied.png"));
			long status = f.length() / 10;
			long progress = 0; // 10% 될 때까지 읽은 누적 바이트 수

			byte[] buf = new byte[1024];
			int statAmount = 0;
			while (true) {
				statAmount = fin.read(buf, 0, buf.length);
				if (statAmount == -1) {	//파일 끝
					if (progress > 0)	//지난 번에 읽었으나 10%에 도달하지 않아 *이 출력되지 않은 경우
						System.out.print("*");
					break;
				}
				if (statAmount > 0)
					fout.write(buf, 0, statAmount);
				
				progress += statAmount; // 파일 크기 10% 될 때까지 읽은 누적 바이트 수
				if (progress >= status) {
					System.out.print("*");
					progress = 0; //초기화
				}
			}
			
		} catch (IOException e) {
			e.getStackTrace();
		} finally {
			if (fin != null)
				try {
					fin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (fout != null)
				try {
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public void run() {
		System.out.println("a.jpg를 복사합니다. \n10%마다 *를 출력합니다.");
		File alien = new File("a.png");
		copyFile(alien);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab08_07 copyFile = new Lab08_07();
		copyFile.run();
	}

}
