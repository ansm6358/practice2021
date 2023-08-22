package ¿¹¿Ü;

public class FoundMax2 {
	int max;
	public FoundMax2(int x, int y) throws MaxFoundException {
		max = x>y ? x:y;
		throw new MaxFoundException(max);
	}
	
	public static void main(String[] args) {
		try {
			new FoundMax2(30,40);
		} catch (MaxFoundException e) {
			e.printStackTrace();
		}
	}

}
