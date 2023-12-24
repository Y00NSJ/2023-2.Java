class TV {
	String tvName;
	int year, inch;
	public TV(String tvName, int year, int inch) {
		this. tvName = tvName;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(tvName + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}


public class Lab04_01 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2023, 32);
		myTV.show();
	}

}
