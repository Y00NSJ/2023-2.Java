import java.util.*;

class Student {
	private String name, major;
	private String id;
	private double score;
	public Student(String name, String major, String id, double score) {
		this.name = name;
		this.major = major;
		this.id = id;
		this.score = score;
	}
	public String getName() {
		return name;
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
}

public class Lab07_05 {
	ArrayList<Student> db = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	public void write() {
		System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String[] inputInfo = scan.nextLine().split(", ");
			db.add(new Student(inputInfo[0], inputInfo[1], inputInfo[2], Double.valueOf(inputInfo[3])));
			
		}
	}
	
	public void read() {
		Iterator<Student> it = db.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println("--------------");
			System.out.println("이름 : " + student.getName());
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
			for (int i = 0; i < db.size(); i++) {
				if (db.get(i).getName().equals(searchName))
					System.out.println(db.get(i).getName() + ", " + db.get(i).getMajor() + ", " + db.get(i).getId() + ", " + db.get(i).getScore());
			}
		}
		scan.close();
	}
	
	public void run() {
		write();
		read();
		search();
		scan.close();
	}

	
	public static void main(String[] args) {
		Lab07_05 studentDB = new Lab07_05();
		studentDB.run();
		
	}

}
