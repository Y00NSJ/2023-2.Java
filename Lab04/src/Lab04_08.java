import java.util.Scanner;

class Phone {
	String name, tel;
	public Phone(String name, String tel) {
		this.name = name; this.tel = tel;
	}
	public String getName() {
		return this.name;
	}
	public String getTel() {
		return this.tel;
	}
}


public class Lab04_08 {
	static Scanner scan = new Scanner(System.in);
	Phone [] phonebook;
	public Lab04_08(int members) {
		phonebook = new Phone [members];
	}
	
	public void input() {
		for (int i = 0; i < phonebook.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >> ");
			phonebook[i] = new Phone(scan.next(), scan.next());
		}
		System.out.println("저장되었습니다..");
	}
	
	public void search() {
		while (true) {
			System.out.print("검색할 이름 >> ");
			String searchName = scan.next();
			if (searchName.equals("그만")) {
				System.out.println("전화번호부를 종료합니다.");
				break;
			}
			int foundIndex = -1;
			for (int i = 0; i < phonebook.length; i++) {
				if (searchName.equals(phonebook[i].getName()))
					foundIndex = i;
			}
			if (foundIndex > -1)
				System.out.println(phonebook[foundIndex].getName() + "의 전화번호는 " + phonebook[foundIndex].getTel() + "입니다.");
			else
				System.out.println(searchName + "이(가) 없습니다.");
			
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("인원수 >> ");
		int members = scan.nextInt();
		Lab04_08 pb = new Lab04_08(members);
		pb.input();
		pb.search();
	}

}
