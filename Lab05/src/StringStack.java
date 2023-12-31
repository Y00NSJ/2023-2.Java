
public class StringStack implements Stack{
	private String[] strStack;
	private int idx;
	
	public StringStack(int arrayLength) {
		strStack = new String[arrayLength];
		idx = 0;
	}
	
	public int length() {
		return idx + 1;
	}
	
	public int capacity() {
		return strStack.length;
	}
	
	public boolean push(String val) {
		if (idx >= strStack.length)
			return false;
		else {
			strStack[idx++] = val;
			return true;
		}
	}
	
	public String pop() {
		if (idx < 0)
			return "";
		else
			return strStack[idx--];
	}
}
