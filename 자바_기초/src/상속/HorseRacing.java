package »ó¼Ó;

public class HorseRacing {
	Animal tony, jeny;
	Horse tony2;
	Zebra jeny2;
	
	public HorseRacing() {
		this.tony = new Horse(4, 10, 3, 50);
		this.jeny = new Zebra(4, 10, 3, 50, 22);
		this.tony2 = new Horse(4, 10, 3, 50);
		this.jeny2 = new Zebra(4, 10, 3, 50, 22);
		
		this.tony.run();
		this.jeny.run();
		
		this.tony2.run();
		this.jeny2.run();
	}
	
	public static void main(String[] args) {
		
		HorseRacing hr = new HorseRacing();
	}
}
