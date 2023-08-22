package ¿¹¿Ü;

public class MaxFoundException extends Exception{
	int max;
	
	public MaxFoundException(int max) {
		this.max = max;
	}

	public String toString() {
		return "max=" + max;
	}
	
}
