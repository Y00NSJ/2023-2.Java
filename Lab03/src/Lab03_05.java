import java.util.Scanner;

public class Lab03_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[10];
		int[] multipleArray = new int[10];
		int j = 0;
		
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		
		for (int i = 0; i < 10; i++) {
			intArray[i] = scan.nextInt();
			if (intArray[i] % 3 == 0) {
				multipleArray[j] = intArray[i];
				j++;
			}
		}
		
		System.out.print("3의 배수는 ");
		for (int i = 0; i < j; i++)
			System.out.print(multipleArray[i] + " ");

		scan.close();
	}

}
