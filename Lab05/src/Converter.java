import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // 단위 변환이 이뤄지는 함수
	
	abstract protected String srcString(); // 원래 단위 명
	
	abstract protected String destString(); // 바꾸어줄 단위 명
	
	protected double ratio; // 비율
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println(srcString() + "을 " + destString() + "로 바꿉니다.");
		System.out.print(srcString() + "을 입력하세요 >> ");
		double val = scan.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과 : " + res + destString() + "입니다.");
		scan.close();
	}
}
