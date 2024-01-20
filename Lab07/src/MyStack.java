import java.util.Vector;

class MyStack<T> implements IStack<T>{
	private Vector<T> myV;
	
	MyStack() {
		myV = new Vector<>();
	}

	@Override
	public T pop() {
		int size = myV.size();
		if (size > 0) {
			T get = myV.get(size - 1);
			myV.remove(size - 1);
			return get;
		}
		else
			return null;
	}

	@Override
	public boolean push(T ob) {
		return myV.add(ob);
	}
}
