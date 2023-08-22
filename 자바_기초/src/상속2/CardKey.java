package »ó¼Ó2;

public class CardKey extends Key {

	int distance;
	
	public CardKey(int no, String passwd, int distance) {
		super(no, passwd);
		this.distance =distance;
	}

	public String toString() {
		return "CardKey [distance=" + distance + ", no=" + no + ", passwd=" + passwd + "]";
	}

}
