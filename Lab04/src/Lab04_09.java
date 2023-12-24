class ArrayUtil {
	static int[] concat(int[] array1, int[] array2) {
		int[] array3 = new int [array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			array3[array1.length + i] = array2[i];
		}
		return array3;
	}
	static void print(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.print("]");
	}
}


public class Lab04_09 {

	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}
