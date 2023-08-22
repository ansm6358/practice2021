package ¿¹¿Ü2;

import java.util.Arrays;
import java.util.Random;

public class Lotto5_2 {
	int lot[], lot2[], bonus;

	public Lotto5_2() {
		super();
		this.lot = new int[6];
		this.lot2 = new int[6];
		
		initLottoNo(lot);
		initLottoNo(lot2);
		initBonusNo();
		javaSort(lot);
		javaSort(lot2);
		
		System.out.println(toString());

	}

	private void javaSort(int[] lottery) {
		java.util.Arrays.sort(lottery);
	}

	public String toString() {
		return "Lotto5_1 [lot=" + Arrays.toString(lot) + ", lot2=" + Arrays.toString(lot2) + ", bonus=" + bonus + "]";
	}

	public void initLottoNo(int lottery[]) { 
		boolean hasValue = false;
		int cnt=0;
		Random rd = new Random();
		
		while(cnt < lottery.length) {
			int num = rd.nextInt(45)+1;
			hasValue = false;
			
			for(int j=0; j<lottery.length; j++) {
				if(lottery[j]==num) {
					hasValue = true;
				}
				}
				if(hasValue == false) {
					lottery[cnt] = num;
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
		Lotto5_2 lot = new Lotto5_2();
	}
}
