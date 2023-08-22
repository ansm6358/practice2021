package ¿¹¿Ü2;

import java.util.Arrays;
import java.util.Random;

class Prize5Exception extends Exception{}
class Prize4Exception extends Exception{}
class Prize3Exception extends Exception{}
class Prize2Exception extends Exception{}
class Prize1Exception extends Exception{}

public class Lotto5_5 {
	int lot[], lot2[], bonus, years, prize[];
	String expense;
	boolean isbonus;

	public Lotto5_5() {
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
			try {
				checkPrize();
			} catch (Prize5Exception e1) {
				System.out.println("Prize5Exception called");
			}catch (Prize4Exception e1) {
				System.out.println("Prize4Exception called");
			}catch (Prize3Exception e1) {
				System.out.println("Prize3Exception called");
			}catch (Prize2Exception e1) {
				System.out.println("Prize2Exception called");
			}catch (Prize1Exception e1) {
				System.out.println("Prize1Exception called");
			} catch (Exception e1) {
				System.out.println("Other Exception called");
			}
			cnt++;

			years = cnt / 5 / 48;
			this.expense = cnt + "x1000";

			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void checkPrize() throws Exception {
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
		switch (cnt) {
		case 0:
		case 1:
		case 2:
			prize[5]++;
			break;
		case 3:
			prize[4]++;
			throw new Prize5Exception();
		case 4:
			prize[3]++;
			//System.out.println("prize 4 " + toString());
			throw new Prize4Exception();
		case 5:
			if (isbonus) {
				prize[1]++;
				//System.out.println("prize 2 " + toString());

				//Thread.sleep(5000);
				throw new Prize2Exception();
			} else {
				prize[2]++;
				//System.out.println("prize 3 " + toString());
				//Thread.sleep(3000);
				throw new Prize3Exception();
			}
		case 6:
			prize[0]++;
			//System.out.println("prize 1 " + toString());

			System.exit(0);
			throw new Prize1Exception();
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
		Lotto5_5 lot = new Lotto5_5();
	}
}
