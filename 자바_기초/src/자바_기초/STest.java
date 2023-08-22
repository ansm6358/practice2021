package 자바_기초;

public class STest {
	static int MAX = 99;
	int min=10;
	
	public static int getMAX() {
		return MAX;
	}

	public static void main(String[] args) {
		STest one = new STest();
		System.out.println(one.getMAX());
		System.out.println(MAX);
		System.out.println(one.min);
	}

}
