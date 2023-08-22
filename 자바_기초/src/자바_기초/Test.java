package 자바_기초;

public class Test {
	int score;

	public Test(int score) {
		this.score = score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return this.score;
	}
	public void printScore() {
		System.out.println(this.score);
	}
	
	public static void main(String[] args) {
		Test one = new Test(70);
		Test two = new Test(85);
		one.printScore();
		two.printScore();
	}
}
