package 자바_기초;

public class Emp {
	int no;
	String name;
	int deptno;
	
	public Emp(int no,String name, int deptno) {
		super();
		this.no = no;
		this.name = name;
		this.deptno = deptno;
	}
	
	public String toString() {
		return "no=" + no + ", name=" + name+", deptno=" + deptno;
	}
}
