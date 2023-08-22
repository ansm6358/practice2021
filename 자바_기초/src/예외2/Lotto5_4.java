package ¿¹¿Ü2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Lotto5_4 {
	int lot[], lot2[], bonus, years, prize[];
	String expense;
	boolean isbonus;

	public Lotto5_4() {
		super();
		this.lot = new int[6];
		this.lot2 = new int[6];
		this.prize = new int[6];

		initLottoNo(lot);
		javaSort(lot);

		running();

	}

	private void running() {
		int cnt = 0;

		while (true) {

			initLottoNo(lot2);
			initBonusNo();
			javaSort(lot2);
			checkPrize();
			cnt++;

			years = cnt / 5 / 48;
			this.expense = cnt + "x1000";

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void checkPrize() {
		int cnt = 0;

		for (int i = 0; i < lot.length; i++) {
			for (int j = 0; j < lot2.length; j++) {
				if (this.lot[i] == this.lot2[j]) {
					cnt++;
				}
			}
		}

		isbonus = false;
		if (cnt == 5) {
			for (int j = 0; j < lot2.length; j++) {
				if (lot[j] == bonus) {
					isbonus = true;
				}
			}
		}
		try {
			switch (cnt) {
			case 0:
			case 1:
			case 2:
				prize[5]++;
				break;
			case 3:
				prize[4]++;
				//System.out.println("prize 5 " + toString());
				break;
			case 4:
				prize[3]++;
				System.out.println("prize 4 " + toString());
				break;
			case 5:
				if (isbonus) {
					prize[1]++;
					System.out.println("prize 2 " + toString());

					Thread.sleep(5000);

				} else {
					prize[2]++;
					System.out.println("prize 3 " + toString());
					Thread.sleep(3000);
				}
				break;
			case 6:
				prize[0]++;
				System.out.println("prize 1 " + toString());

				System.exit(0);
				break;

			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		Lotto5_4 lot = new Lotto5_4();
	}
}
