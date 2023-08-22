package ¿¹¿Ü2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Lotto5_3 {
	int lot[], lot2[], bonus,years;
	String expense;
	
	public Lotto5_3() {
		super();
		this.lot = new int[6];
		this.lot2 = new int[6];

		initLottoNo(lot);
		javaSort(lot);

		running();

	}

	private void running() {
		int cnt = 0;
		
		for(int i=0; i<1000; i++) {
			
			initLottoNo(lot2);
			initBonusNo();
			javaSort(lot2);
			cnt++;
			
			double amount = Double.parseDouble(""+(cnt*1000));
			DecimalFormat formatter= new DecimalFormat("#,###");
			
			years=cnt/5/48;
			this.expense = formatter.format(amount);
			
			System.out.println(toString());
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Finished");
	}

	private void javaSort(int[] lottery) {
		java.util.Arrays.sort(lottery);
	}

	public String toString() {
		return "Lotto5_3 [lot=" + Arrays.toString(lot) + ", lot2=" + Arrays.toString(lot2) + ", bonus=" + bonus
				+ ", years=" + years + ", expense=" + expense + "]";
	}

	public void initLottoNo(int lottery[]) {
		boolean hasValue = false;
		int cnt = 0;
		Random rd = new Random();

		while (cnt < lottery.length) {
			int num = rd.nextInt(45) + 1;
			hasValue = false;

			for (int j = 0; j < lottery.length; j++) {
				if (lottery[j] == num) {
					hasValue = true;
				}
			}
			if (hasValue == false) {
				lottery[cnt] = num;
				cnt++;
			}

		}
	}

	public void initBonusNo() {
		boolean hasValue = false;
		Random rd = new Random();
		while (true) {
			int num = rd.nextInt(45) + 1;
			hasValue = false;
			for (int j = 0; j < lot.length; j++) {
				if (lot[j] == num) {
					hasValue = true;
				}
			}
			if (hasValue == false) {
				this.bonus = num;
				break;
			}
		}
	}

	public static void main(String[] args) {
		Lotto5_3 lot = new Lotto5_3();
	}
}
