import java.util.Scanner;

public class Lab06_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		StringBuffer sb = new StringBuffer(scan.nextLine());
		
		while (true) {
			System.out.print("명령 : ");
			String order = scan.next();
			
			if (order.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String[] orderArray = order.split("!");
			if (orderArray.length != 2) {
				System.out.println("잘못된 명령입니다!");
				continue;
			}
			
			else if (orderArray[0].length() == 0 || orderArray[1].length() == 0) {
				System.out.println("잘못된 명령입니다!");
				continue;
			}
			
			int sloc = sb.indexOf(orderArray[0]);
			
			if (sloc == -1) {
				System.out.println("찾을 수 없습니다!");
				continue;
			}
			sb = sb.replace(sloc, sloc + orderArray[0].length(), orderArray[1]);
			System.out.println(sb.toString());
			
			
		}
		
		scan.close();
	}

}
