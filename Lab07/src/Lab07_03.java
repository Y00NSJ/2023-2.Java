import java.util.*;

public class Lab07_03 {	
	public void run() {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000) ");
		while (true) {
			System.out.print("나라 이름, 인구 >> ");
			String iLine = scan.next();
			if (iLine.equals("그만"))
				break;
			Integer iPop = scan.nextInt();
			nations.put(iLine, iPop);
		}
		
		while (true) {
			System.out.print("인구 검색 >> ");
			String searchKey = scan.next();
			if (searchKey.equals("그만"))
				break;
			if (!nations.containsKey(searchKey)) {//get().equals(null)
				System.out.println(searchKey + " 나라는 없습니다.");
				continue;
			}
			System.out.println(searchKey + "의 인구는 " + nations.get(searchKey) + "명 입니다.");
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		Lab07_03 population = new Lab07_03();
		population.run();
	}

}
