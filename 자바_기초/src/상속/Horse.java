package »ó¼Ó;

public class Horse extends Animal{
	int numOfLeg, power;


	public Horse(int numOfLeg, int power, int color, int speed) {
		super(color,speed);
		this.numOfLeg = numOfLeg;
		this.power = power;

	}

	public int getNumOfLeg() {return numOfLeg;}

	public void setNumOfLeg(int numOfLeg) {this.numOfLeg = numOfLeg;}

	public int getPower() {return power;}

	public void setPower(int power) {this.power = power;}

	public int getColor() {return color;}

	public void setColor(int color) {this.color = color;}

	public int getSpeed() {return speed;}

	public void setSpeed(int speed) {this.speed = speed;}

	@Override
	public void run() {
		System.out.println(toString());
	}

	public String toString() {
		return "Horse [numOfLeg=" + numOfLeg + ", power=" + power + ", color=" + color + ", speed=" + speed + "]";
	}

}
