package 자바_기초;

import java.util.Arrays;
import java.util.Scanner;

public class 연습문제3 {

	public static void main(String[] args) {
//		P76Q18();
//		Q19();
//		Q20();
//		Q21();
//		Q22();
//		Q23();
//		Q24();
//		Q25to29();
//		Q30toQ34();
		Q35();

	}

	private static void Q35() {
		int balance = 0;
		
		
		start(balance);
		
		
	}

	private static void start(int balance) {
		int money = 0;
		System.out.println("=============");
		System.out.println("   M E N W   ");
		System.out.println("=============");
		System.out.println("1. 예금");
		System.out.println("2. 조회");
		System.out.println("3. 인출");
		System.out.println("9. Quit");
		System.out.println("*잔액: " + balance);
		System.out.println("=============");
		Scanner scanner = new Scanner(System.in);	
		int select = scanner.nextInt();
		switch (select) {
		case 1:
			System.out.println("예금할 돈을 입력해주세요.");
			Scanner scanner1 = new Scanner(System.in);	
			money=scanner1.nextInt();
			balance = balance+money;
			System.out.println("*잔액: " + balance);
			start(balance);
			break;
		case 2:
			Scanner scanner2 = new Scanner(System.in);	
			System.out.println("*잔액: " + balance);
			start(balance);
			break;
		case 3:
			System.out.println("인출할 돈을 입력해주세요.");
			Scanner scanner3 = new Scanner(System.in);	
			money=scanner3.nextInt();
			if(money>balance) {
				System.out.println("잔액이 부족합니다. 현재잔액: "+balance);
			} else {
				balance = balance - money;
				System.out.println(money+"원을 인출 했습니다. 현재잔액: "+balance);
			}
			start(balance);
			break;
		case 9:
			System.exit(0);
			break;
		default:
			System.out.println("다시 입력하세요.");
			start(balance);
			break;}
	}

	private static void Q30toQ34() {
		Emp emp[] = new Emp[5];
		emp[0] = new Emp(1, "Kim", 2);
		emp[1] = new Emp(2, "Lee", 3);
		emp[2] = new Emp(3, "Park", 1);
		emp[3] = new Emp(4, "Choi", 1);
		emp[4] = new Emp(5, "Kwon", 1);
		Dept dept[] = new Dept[3];
		dept[0] = new Dept(1, "Marketing");
		dept[1] = new Dept(2, "Financing");
		dept[2] = new Dept(3, "Planning");

		Q30(emp);
		Q31(dept);
		Q32(emp, dept);
		Q33(emp, dept);
		Q34(emp, dept);
	}

	private static void Q30(Emp[] emp) {
		for (Emp Emp : emp) {
			System.out.println(Emp.toString());
		}
	}

	private static void Q31(Dept[] dept) {
		for (Dept Dept : dept) {
			System.out.println(Dept.toString());
		}
	}

	private static void Q32(Emp[] emp, Dept[] dept) {
		for (Emp Emp : emp) {
			for (Dept Dept : dept) {
				if (Emp.deptno == Dept.dno) {
					System.out.println(Emp.no + " " + Emp.name + " " + Emp.deptno + " " + Dept.dname);
				}
			}
		}
	}

	private static void Q33(Emp[] emp, Dept[] dept) {
		String Dname = "Marketing";
		for (Dept Dept : dept) {
			if (Dept.dname.equals(Dname)) {
				for (Emp Emp : emp) {
					if (Emp.deptno == Dept.dno) {
						System.out.println(Emp.no + " " + Emp.name + " " + Emp.deptno + " " + Dept.dname);
					}
				}
			}
		}
	}

	private static void Q34(Emp[] emp, Dept[] dept) {
		int dnum = 5;
		for (Emp Emp : emp) {
			if (Emp.no == dnum) {
				for (Dept Dept : dept) {
					if (Emp.deptno == Dept.dno) {
						System.out.println(Emp.no + " " + Emp.name + " " + Emp.deptno + " " + Dept.dname);
					}
				}
			}
		}
	}

	private static void Q25to29() {
		int A[][] = { { 11, 12, 13, 14, 15 }, { 178, 170, 165, 169, 185 }, { 12, 13, 11, 11, 11 } };
		int B[][] = { { 11, 12, 13 }, { 200, 500, 450 } };
		// Q25(A);
		// Q26(B);
//		Q27(A, B);
//		Q28(A, B);
//		Q29(A);

	}

	private static void Q28(int[][] A, int[][] B) {
		String list;

		for (int i = 0; i < A[0].length; i++) {
			list = "";
			if (A[2][i] == 11) {
				for (int j = 0; j < A.length; j++) {
					list = list + " " + A[j][i];
				}
				for (int k = 0; k < B[0].length; k++) {

					if (B[0][k] == A[2][i]) {
						list = list + " " + B[1][k];
					}
				}
				System.out.println(list);
			}
		}
	}

	private static void Q29(int[][] A) {
		int height = 0;

		for (int i = 0; i < A[0].length; i++) {
			if (A[2][i] == 11) {
				height = height + A[1][i];
				System.out.println("11 " + height);
			}

		}
		System.out.println("11 " + height);
	}

	private static void Q27(int[][] A, int[][] B) {
		String list;

		for (int i = 0; i < A[0].length; i++) {
			list = "";
			for (int j = 0; j < A.length; j++) {
				list = list + " " + A[j][i];
			}
			for (int k = 0; k < B[0].length; k++) {

				if (B[0][k] == A[2][i]) {
					list = list + " " + B[1][k];
				}
			}
			System.out.println(list);
		}

	}

	private static void Q26(int[][] B) {
		String list;
		for (int num[] : B) {
			list = "";
			for (int i = 0; i < num.length; i++) {
				list = list + " " + num[i];
			}
			System.out.println(list);
		}
	}

	private static void Q25(int[][] A) {
		String list;
		for (int num[] : A) {
			list = "";
			for (int i = 0; i < num.length; i++) {
				list = list + " " + num[i];
			}
			System.out.println(list);
		}
	}

	private static void Q24() {
		int score[][] = { { 15001, 88, 89, 96 }, { 15007, 77, 98, 67 }, { 15003, 56, 79, 96 }, { 15803, 89, 86, 79 },
				{ 16573, 91, 67, 74 } };
		int sum;
		for (int num[] : score) {
			sum = 0;
			for (int i = 1; i < num.length; i++) {
				sum = sum + num[i];
			}
			System.out.println("학번 " + num[0] + "의 총점 : " + sum);
		}
	}

	private static void Q23() {
		int tree[][] = new int[5][10];

	}

	private static void Q22() {
		int score[] = { 32, 89, 5, 23, 67, 45, 8, 99, 24, 68 };
		System.out.println("처음 " + Arrays.toString(score));

		Sort(score, 0, score.length);

	}

	private static int[] Sort(int[] score, int first, int end) {
		int tempScore[];
		int mid = (first + end) / 2;
		if (first < mid) {

			System.out.println(Arrays.toString(score));
			for (int i = mid; i > first - 1; i--) {
				if (score[i] > score[mid]) {
					score = sorting(score, i, mid);
					mid--;
				}
			}
			for (int i = mid; i < end; i++) {
				if (score[i] < score[mid]) {
					score = sorting(score, i, mid);
					mid++;
				}
			}

			tempScore = Sort(score, first, mid);
			for (int i = 0; i < mid; i++) {
				score[i] = tempScore[i];
			}
			tempScore = Sort(score, mid, end);
			for (int i = mid; i < end; i++) {
				score[i] = tempScore[i];
			}
		}
		return score;

	}

	private static int[] sorting(int[] score, int num, int mid) {
		int temp = score[num];
		if (num < mid) {
			for (int i = num; i < mid; i++) {
				score[i] = score[i + 1];
			}
		} else if (num > mid) {
			for (int i = num; i > mid; i--) {
				score[i] = score[i - 1];
			}
		}
		score[mid] = temp;
		return score;
	}

	private static void Q21() {
		int score[] = { 89, 87, 98, 100, 77 };
		String name[] = { "cskim", "phppark", "sdoh", "chlim", "drlee" };
		int target = 77;

		for (int i = 0; i < score.length; i++) {
			if (score[i] == target) {
				System.out.println(target + "은 " + (i + 1) + "번쨰, 이름은 " + name[i]);
			}
		}
	}

	private static void Q20() {
		int temp[] = { 10, 20, 30, 40, 50 };
		boolean is40 = false;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == 40) {
				System.out.println("40: " + (i + 1) + "번째");
				is40 = true;
			}
		}
		if (is40) {
			System.out.println("40 찾음");
		} else {
			System.out.println("40 못찾음");
		}
	}

	private static void Q19() {
		String score1[] = { "How", "have", "you", "been", "?" };
		String score2[] = new String[5];
		String score3[] = new String[5];

		score2[0] = "How";
		score2[1] = "have";
		score2[2] = "you";
		score2[3] = "been";
		score2[4] = "?";

		score3[0] = new String("How");
		score3[1] = new String("have");
		score3[2] = new String("you");
		score3[3] = new String("been");
		score3[4] = new String("?");

		for (int i = 0; i < score1.length; i++) {
			System.out.print(score1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < score2.length; i++) {
			System.out.print(score2[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < score3.length; i++) {
			System.out.print(score3[i] + " ");
		}
		System.out.println();

	}

	private static void P76Q18() {
		int score[] = { 10, 20, 30, 40, 50, 60, 70 };
		int sum = 0;
		for (int scored : score) {
			sum = sum + scored;
			System.out.println("total: " + sum);
		}
	}

}
