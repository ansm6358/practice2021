package ¿¹¿Ü;

public class FoundMax3 {
	int max;
	public FoundMax3(int x, int y) throws MaxFoundException {
		max = x>y ? x:y;
		throw new MaxFoundException(max);
	}
	
	public static void main(String[] args) throws MaxFoundException {
			new FoundMax3(30,40);
	
	}

}
