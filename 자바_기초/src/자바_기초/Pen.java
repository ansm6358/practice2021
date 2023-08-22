package 자바_기초;

public class Pen {
	int no, price;
	String com,color;
	
	public Pen(int no, String com, int price, String color) {
		this.no = no;
		this.com = com;
		this.price = price;
		this.color = color;
	}
	
	public void print() {
		System.out.println("NO="+this.no+" Company="+this.com+" Price="+this.price+" Color"+this.color);
	};

	public static void main(String[] args) {
		Pen p1 = new Pen(1,"Monami",300,"Black");
		Pen p2 = new Pen(2,"LG",250,"Red");
		Pen p3 = new Pen(3,"Donga",200,"Blue");
		p1.print();
		p2.print();
		p3.print();
	}

}
