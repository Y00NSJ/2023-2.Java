//Lab05_01

class ColorTV extends TV {
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}
	
	public void printProperty() {
		System.out.println(getSize() + "인치 " + getColor() + "컬러");
	}

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
	
}
