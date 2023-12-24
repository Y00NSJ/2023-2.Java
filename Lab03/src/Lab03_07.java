
public class Lab03_07 {

	public static void main(String[] args) {
		int [] randomIntArray = new int [10];
		int sum = 0;
		
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < 10; i++) {
			randomIntArray[i] = (int)(Math.random() * 10) + 1; //Math.random : 0.0 이상 1.0 미만
			sum += randomIntArray[i];
			System.out.print(randomIntArray[i] + " ");
		}
		System.out.print("\n평균은 " + ((double)sum / randomIntArray.length));
	}

}
