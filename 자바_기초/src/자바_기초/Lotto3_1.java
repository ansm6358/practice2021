package 자바_기초;

import java.util.Arrays;
import java.util.Random;

public class Lotto3_1 {
	// P141
	int lot[];
	int bonus;

	public Lotto3_1() {
		super();
		this.lot = new int[6];
	}

	public String toString() {
		return "심화문제2 [lot=" + Arrays.toString(lot) + ", bonus=" + bonus + "]";
	}

	public void initLottoNo() {
		Random rd = new Random();
		boolean overlap = false;
		for (int i = 0; i < this.lot.length; i++) {
			overlap = true;
			while (overlap) {
				this.lot[i] = rd.nextInt(45) + 1;
				overlap = false;
				for (int j = 0; j < i; j++) {
					if (this.lot[j] == this.lot[i]) {
						overlap = true;
					}
				}
			}
		}
	}

	private void initBonusNo() {
		Random rd = new Random();
		boolean overlap = false;
		do {
			this.bonus = rd.nextInt(45)+1;
			for (int i = 0; i < this.lot.length; i++) {
				if (this.lot[i] == this.bonus) {
					overlap = true;
				}
			}
		} while (overlap);

	}

	public void bubbleSort() {
		int temp;
		for(int i=0; i<this.lot.length-2;i++) {
			for(int j=i+1; j<this.lot.length-1;j++) {
				if(this.lot[i]>this.lot[j]) {
					temp=this.lot[i];
					this.lot[i]=this.lot[j];
					this.lot[j]=temp;			
				}
			}
		}

	}
	public void javaSort() {
		java.util.Arrays.sort(this.lot);
	};
	public static void main(String[] args) {
		Lotto3_1 lot = new Lotto3_1();
		lot.initLottoNo();
		lot.initBonusNo();
		lot.javaSort();
		System.out.println(lot.toString());
	}

}
