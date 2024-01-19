import java.util.*;

public class Lab07_08 {
	HashMap<String, Integer> point = new HashMap<>();
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("** 포인트 관리 프로그램입니다. **");
		while (true) {
			System.out.print("이름과 포인트 입력(띄어쓰기로 구분) >> ");
			StringTokenizer iLine = new StringTokenizer(scan.nextLine());
			String name = iLine.nextToken();
			if (name.equals("그만"))
				break;
			int newP = Integer.valueOf(iLine.nextToken());
			Integer isPoint = point.get(name);
			if (isPoint == null)
				point.put(name, newP);
			else {
				isPoint += newP;
				point.put(name, isPoint);
			}
			print();
		}
		scan.close();
	}
	
	public void print() {
		Set<String> pKey = point.keySet();
		Iterator<String> it = pKey.iterator();
		while(it.hasNext()) {
			String pName = it.next();
			System.out.print("(" + pName + ", " + point.get(pName) + ")");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab07_08 pointDB = new Lab07_08();
		pointDB.run();
	}

}
