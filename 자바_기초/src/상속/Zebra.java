package »ó¼Ó;

public class Zebra extends Horse {
	int numOfStripe;
	
	public Zebra(int numOfLeg, int power, int color, int speed,int numOfStripe) {
		super(numOfLeg,power,color,speed);
		this.numOfStripe = numOfStripe;
	}

	public int getNumOfStripe() {return numOfStripe;}

	public void setNumOfStripe(int numOfStripe) {this.numOfStripe = numOfStripe;}

	@Override
	public void run() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Zebra [numOfStripe=" + numOfStripe + ", numOfLeg=" + numOfLeg + ", power=" + power + ", color=" + color
				+ ", speed=" + speed + "]";
	}
	
	
}
