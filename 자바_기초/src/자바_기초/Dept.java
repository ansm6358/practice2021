package 자바_기초;

public class Dept {
	int dno;
	String dname;
	
	public Dept(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
	}
	
	public String toString() {
		return "dno=" + dno + ", dname=" + dname;
	}
}
