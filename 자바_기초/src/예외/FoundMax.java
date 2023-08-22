package ¿¹¿Ü;

public class FoundMax {
	int max;
	public FoundMax(int x, int y) {
		max = x>y ? x:y;
		try {
			throw new MaxFoundException(max);
		} catch (MaxFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new FoundMax(30,40);
	}

}
