import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		StringStack st = new StringStack(scan.nextInt());
		
		while (true) {
			System.out.print("문자열 입력 >> ");
			String stackInput = scan.next();
			if (stackInput.equals("그만")) 
				break;
			if (st.push(stackInput) == false)
				System.out.println("스택이 꽉 차서 푸시 불가!");
		}
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for (int i = 0; i < st.capacity(); i++)
			System.out.print(st.pop() + " ");
		scan.close();
	}

}
