package �ڹ�_����;

import java.util.Scanner;

public class �ڵ��Ǹű� {
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
		System.out.println("����ݾ�: "+change);
		}
			end(change);
	}

	private static int choose(int change) {
		String soda, juice, cola;
		soda = "���̴�.";
		juice = "�ֽ�";
		cola = "�ݶ�";

		System.out.println("1.���̴� 2.�ֽ� 3.�ݶ� 4.��� ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("���̴ٰ� ���Խ��ϴ�.");
			change=change-500;
			break;
		case 2:
			System.out.println("�ֽ��� ���Խ��ϴ�.");
			change=change-500;
			break;
		case 3:
			System.out.println("�ݶ� ���Խ��ϴ�.");
			change=change-500;
			break;
		case 4:
			end(change);
			break;
		default:
			System.out.println("�ٽ� �Է��ϼ���.");
			change=choose(change);
			break;
		}
		return change;

	}

	private static int put(int change) {
		System.out.println("���� �־��ּ���");
		Scanner scanner = new Scanner(System.in);
		int plusMoney = scanner.nextInt();
		if (plusMoney == -1) {
			end(change);
		} else {
			change = change + plusMoney;
			System.out.println("���� ���� �ݾ�: " + change);
		}
		return change;

	}

	private static void end(int change) {
		System.out.println("�Ž����� " + change + "���� �޾ҽ��ϴ�.");
		System.exit(0);
	}

}
