package ���;

public abstract class Animal {
	int color, speed;
	
	public Animal(int color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}
	
	public abstract void run();
}
