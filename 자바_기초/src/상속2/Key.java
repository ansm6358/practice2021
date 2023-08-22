package »ó¼Ó2;

public class Key extends Symbol implements KeyInterface {
	int no;
	String passwd;

	public Key(int no, String passwd) {
		super();
		this.no = no;
		this.passwd = passwd;
	}

	public String toString() {
		return "Key [no=" + no + ", passwd=" + passwd + "]";
	}

	public void symbolize() {
		System.out.println("Happy!!!");
	}

	public void symbolizel() {
		symbolize();
	}

}
