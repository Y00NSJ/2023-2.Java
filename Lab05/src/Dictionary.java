
public class Dictionary extends PairMap{
	private int idx = -1;
	
	public Dictionary(int capacity) {
		keyArray = new String[capacity];
		valueArray = new String[capacity];
	}
	
	public String get(String key) {
		int searchIdx = -1;
		for (int i = 0; i < keyArray.length; i++) {
			if (key.equals(keyArray[i]))
				searchIdx = i;
		}
		if (searchIdx > -1)
			return valueArray[searchIdx];
		else
			return null;
	}
	
	public void put(String key, String value) {
		int i;
		for (i = 0; i <= idx; i++) {
			if (key.equals(keyArray[i]))
				valueArray[i] = value;
		}
		if (i > idx) {
			idx++;
			keyArray[idx] = key;
			valueArray[idx] = value;
		}
	}
	
	String delete(String key) {
		String deletedValue = null;
		for (int i = 0; i <= idx; i++) {
			if (key.equals(keyArray[i])) {
				keyArray[i] = null;
				deletedValue = valueArray[i];
				valueArray[i] = null;
				idx--;
			}
		}
		return deletedValue;
	}
	
	int length() {
		return idx;
	}
}
