import java.util.Calendar;

public class Lab06_05 {

	public static void main(String[] args) {
		Calendar greet = Calendar.getInstance();
		System.out.println("지금 시간은 " + Calendar.HOUR_OF_DAY + "시 " + Calendar.MINUTE + "분입니다.");
		int daytime = greet.get(Calendar.HOUR_OF_DAY);
		if (daytime >= 4 && daytime < 12)
			System.out.println("Good Morning");
		else if (daytime >= 12 && daytime < 18)
			System.out.println("Good Afternoon");
		else if (daytime >= 18 && daytime < 22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}

}
