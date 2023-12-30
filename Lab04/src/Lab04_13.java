import java.util.Scanner;

class Player {
	// 이름 변수 선언
	private String name;
	// 생성자 (파라미터 : 이름)
	public Player(String name) {
		this.name = name;
	}

	// getName() 함수
	public String getName() {
		return name;
	}
}

public class Lab04_13 {
	// Scanner 객체
	Scanner scan = new Scanner(System.in, "EUC-KR");
	// Player 배열 선언
	static Player [] p;
	// 현재 단어 저장하는 변수 선언(끝말잇기 시작단어) ex : String currentWord="아버지"
	String currentWord = "아버지";
	
	// beforSetting() 함수 선언
	public void beforeSetting() {
		// 끝말잇기 게임 시작 ... 출력
		System.out.println("끝말잇기 게임 시작 ...");
		// 게임 참가 인원 입,출력
		System.out.print("게임에 참가하는 인원은 몇 명입니까? >> ");
		int pMembers = scan.nextInt();
		// Player 배열 선언
		p = new Player[pMembers];
		// 입력받은 인원 수 만큼 이름 입력 받은 다음 player 정보 세팅 -> 생성자 이용
		for(int i = 0; i<pMembers; i++) {
			System.out.print("참가자의 이름을 입력하세요 >> ");
			String name = scan.next();
			p[i] = new Player(name);
		}
		
	}
	
	// start 함수 선언
	public void start() {
		// 졌을 경우를 나타내는 boolean 변수(lose)
		boolean lose = false;
		System.out.println("시작하는 단어는 " + currentWord + "입니다.");
		while(true) {
			// player 를 번갈아가면서 수행
			for(int i=0; i < p.length; i++) {
				// getName 사용하여 선수 이름 출력
				System.out.print(p[i].getName()+">> ");
				// 단어 입력
				String word = scan.next();
				// if(...) --> 현재 단어와 입력 받은 단어의 첫글자와 동일한지 -> substring() 사용
				if (word.substring(0, 1).equals(currentWord.substring(currentWord.length()-1)))
					// 동일하다면 현재 단어를 입력받은 단어로 변경
					currentWord = word;
				// else
				else {
					// 졌습니다. 출력
					System.out.println(p[i].getName()+"이(가) 졌습니다.");
					// lose 를 true 로 변경
					lose = true;
					// for 빠져나가기
					break;
				}
			}
			// lose 가 true 이면  while loop break과  scanner 닫기
			if (lose == true) {
				scan.close();
				System.out.println("윤서진 1916676");
				break;
			}
			
		}
	
	}
	
	public static void main(String[] args) {
		Lab04_13 wordGameApp = new Lab04_13();
		wordGameApp.beforeSetting();
		wordGameApp.start();
	}

}

