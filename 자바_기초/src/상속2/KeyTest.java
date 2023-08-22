package »ó¼Ó2;

public class KeyTest {

	Key k1,k2,k3;
	CardKey c1,c2;
	BioKey b1,b2;

	public KeyTest() {
		this.k1 = new Key(1, "1234");
		this.c1 = new CardKey(2, "4321",10);
		this.b1 = new BioKey(3, "4321",5);
		System.out.println(k1+"\n"+c1+"\n"+b1);
		
		this.k2 = new CardKey(4,"4321",10);
		this.k3 = new BioKey(5,"4321",5);
		System.out.println(k2+"\n"+k3);
	}
	
	public static void main(String[] args) {
		KeyTest kt = new KeyTest();
	}

}
