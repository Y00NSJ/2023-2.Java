import java.util.Scanner;

public class Lab02_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int edge[] = new int[3];
		int maxEdge = 0;
		System.out.print("정수 3개를 입력하세요 >> ");
		for (int i = 0; i < 3; i++) 
			edge[i] = scan.nextInt();
		if (edge[0] + edge[1] > edge[2] && edge[0] + edge[2] > edge[1] && edge[1] + edge[2] > edge[0])
			System.out.println("삼각형이 됩니다.");
		else
			System.out.println("삼각형을 만들 수 없습니다.");
		scan.close();
	}

}
