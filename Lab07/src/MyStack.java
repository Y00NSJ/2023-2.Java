import java.util.Vector;

class MyStack<T> implements IStack{
	private Vector<T> myV;
	
	MyStack() {
		myV = new Vector<>();
	}

	@Override
	public T pop() {
		T popObj = myV.lastElement();
		if (popObj != null)
			myV.remove(popObj);
		return popObj;
	}

	@Override
	public boolean push(T ob) {
		return myV.add(ob);
	}
}
