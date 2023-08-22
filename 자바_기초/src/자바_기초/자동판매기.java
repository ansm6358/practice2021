package 자바_기초;

import java.util.Scanner;

public class 자동판매기 {
	public static void main(String[] args) {
		start();

	}

	private static void start() {
		int change = 0;

		while (change < 500) {
			change = put(change);
		}
		while(change >= 500) {
		change=choose(change);
		System.out.println("현재금액: "+change);
		}
			end(change);
	}

	private static int choose(int change) {
		String soda, juice, cola;
		soda = "사이다.";
		juice = "주스";
		cola = "콜라";

		System.out.println("1.사이다 2.주스 3.콜라 4.취소 ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("사이다가 나왔습니다.");
			change=change-500;
			break;
		case 2:
			System.out.println("주스가 나왔습니다.");
			change=change-500;
			break;
		case 3:
			System.out.println("콜라가 나왔습니다.");
			change=change-500;
			break;
		case 4:
			end(change);
			break;
		default:
			System.out.println("다시 입력하세요.");
			change=choose(change);
			break;
		}
		return change;

	}

	private static int put(int change) {
		System.out.println("돈을 넣어주세요");
		Scanner scanner = new Scanner(System.in);
		int plusMoney = scanner.nextInt();
		if (plusMoney == -1) {
			end(change);
		} else {
			change = change + plusMoney;
			System.out.println("현재 넣은 금액: " + change);
		}
		return change;

	}

	private static void end(int change) {
		System.out.println("거스름돈 " + change + "원을 받았습니다.");
		System.exit(0);
	}

}
