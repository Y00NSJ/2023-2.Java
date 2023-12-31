
public class Won2Dollar extends Converter {
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	
	protected String srcString() {
		return "원";
	}
	
	protected String destString() {
		return "달러";
	}
	
	
	protected double convert(double src) {
		return src / ratio;
	}
	
	
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}
