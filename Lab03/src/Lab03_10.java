
public class Lab03_10 {

	public static void main(String[] args) {
		int [][] sdArray = new int [4][4];
		int j, k;
		
		for (int i = 0; i < 10; i++) {
			while (true) {
				j = (int)(Math.random() * 4);
				k = (int)(Math.random() * 4);
				if (sdArray[j][k] == 0)
					break;
			}
			sdArray[j][k] = (int)(Math.random() * 10) + 1;
		}
		
		for (j = 0; j < 4; j++) {
			for (k = 0; k < 4; k++) {
				System.out.print(sdArray[j][k] + "\t");
			}
			System.out.println();
		}
	}

}
