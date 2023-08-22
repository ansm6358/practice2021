package ¿¹¿Ü2;

import java.util.Arrays;
import java.util.Random;

public class Lotto5_1 {
	int lot[], lot2[], bonus;

	public Lotto5_1() {
		super();
		this.lot = new int[6];
		this.lot2 = new int[6];
		
		initLottoNo(lot);
		initLottoNo(lot2);
		initBonusNo();
		System.out.println(toString());

	}

	public String toString() {
		return "Lotto5_1 [lot=" + Arrays.toString(lot) + ", lot2=" + Arrays.toString(lot2) + ", bonus=" + bonus + "]";
	}

	public void initLottoNo(int lottory[]) {
		boolean hasValue = false;
		int cnt=0;
		Random rd = new Random();
		
		while(cnt < lottory.length) {
			int num = rd.nextInt(45)+1;
			hasValue = false;
			
			for(int j=0; j<lottory.length; j++) {
				if(lottory[j]==num) {
					hasValue = true;
				}
				}
				if(hasValue == false) {
					lottory[cnt] = num;
					cnt++;
				}
			
		}
	}

	public void initBonusNo() {
		boolean hasValue = false;
		Random rd = new Random();
		while(true) {
			int num = rd.nextInt(45)+1;
			hasValue = false;
			for(int j=0;j<lot.length;j++) {
				if(lot[j]==num) {
					hasValue = true;
				} 
			}	
				if(hasValue == false) {
					this.bonus = num;
					break;
				}
		} 
	}

	public static void main(String[] args) {
		Lotto5_1 lot = new Lotto5_1();
	}
}
