import java.util.*;

class Student {
	private String name, major;
	private int id;
	private double score;
	public Student(String name, String major, int id, double score) {
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
	public int getId() {
		return id;
	}
	public double getScore() {
		return score;
	}
	public String toString() {
		System.out.println("----------------------");
		return ("이름 : " + getName() + "\n학과 : " + getMajor() + "\n학번 : " + getId() + "\n학점평균 : " + getScore());
	}
}

public class Lab07_05 {
	public static void run(ArrayList<Student> al) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
		for (int i = 0; i < al.size(); i++) {
			String[] inputInfo = scan.nextLine().split(", ");
			al.add(new Student(inputInfo[0], inputInfo[1], Integer.valueOf(inputInfo[2]), Double.valueOf(inputInfo[3])));
			
		}
		
		for (Student s : al)
			s.toString();
		
		while (true) {
			System.out.print("학생 이름 >> ");
			String searchName = scan.next();
			if (searchName.equals("그만"))
				break;
			for (int i = 0; i < 4; i++) {
				if (al.get(i).getName().equals(searchName))
					System.out.println(al.get(i).getName() + ", " + al.get(i).getMajor() + ", " + al.get(i).getId() + ", " + al.get(i).getScore());
					continue;
			}
			System.out.println("해당하는 학생 정보가 존재하지 않습니다.");
		}
		scan.close();
	}
	

	
	public static void main(String[] args) {
		ArrayList<Student> db = new ArrayList<>();
		Lab07_05 studentDB = new Lab07_05();
		studentDB.run(db);
	}

}
