
public class Km2Mile extends Converter {
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	
	protected String srcString() {
		return "Km";
	}
	
	protected String destString() {
		return "mile";
	}
	
	protected double convert(double src) {
		return src / ratio;
	}
	
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}

}
