import java.util.*;

class Student1 {
	private String major;
	private String id;
	private double score;
	public Student1(String major, String id, double score) {
		this.major = major;
		this.id = id;
		this.score = score;
	}
	public String getMajor() {
		return major;
	}
	public String getId() {
		return id;
	}
	public double getScore() {
		return score;
	}
	public void print() {
		System.out.println(getMajor() + ", " + getId() + ", " + Double.toString(getScore()));
	}
}

public class Lab07_05_02 {
	HashMap<String, Student1> db = new HashMap<>();
	Scanner scan = new Scanner(System.in);
	
	public void write() {
		System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String[] inputInfo = scan.nextLine().split(", ");
			db.put(inputInfo[0], new Student1(inputInfo[1], inputInfo[2], Double.valueOf(inputInfo[3])));
			
		}
	}
	
	public void read() {
		Set<String> keys = db.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Student1 student = db.get(name);
			System.out.println("--------------");
			System.out.println("이름 : " + name);
			System.out.println("학과 : " + student.getMajor());
			System.out.println("학번 : " + student.getId());
			System.out.println("학점 평균 : " + student.getScore());
		}
		System.out.println("--------------");	
	}
	
	public void search() {
		while (true) {
			System.out.print("학생 이름 >> ");
			String searchName = scan.next();
			if (searchName.equals("그만"))
				break;
			if (db.containsKey(searchName)) {
				System.out.print(searchName + ", ");
				db.get(searchName).print();
			}
			else
				System.out.println("해당하는 학생이 등록되어 있지 않습니다.");
		}
	}
	
	public void run() {
		write();
		read();
		search();
		scan.close();
	}

	
	public static void main(String[] args) {
		Lab07_05_02 studentDB = new Lab07_05_02();
		studentDB.run();
		
	}

}
