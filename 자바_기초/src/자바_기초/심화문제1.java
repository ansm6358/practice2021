package 자바_기초;

import java.util.Random;

public class 심화문제1 {

	public static void main(String[] args) {
//		P94Q1();
//		Q2();
//		Q3();
//		Q4();
//		Q5();
		Q6();
	}

	private static void P94Q1() {
		int num1, num2, num3, num4, num5, num6, bonusNum;
		num1 = 7;
		num2 = 19;
		num3 = 23;
		num4 = 34;
		num5 = 39;
		num6 = 42;
		bonusNum = 5;

		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + ", Bonus " + bonusNum);

	}

	private static void Q2() {
		Random rand = new Random();
		int num = rand.nextInt();
		if (num > 45) {
			System.out.println("Number is greater than 45! " + num);
		} else {
			System.out.println("Number is " + num);
		}
	}

	private static void Q3() {
		Random rand = new Random();
		int num1, num2, num3, num4, num5, num6, bonusNum;
		num1 = rand.nextInt(45) + 1;
		num2 = rand.nextInt(45) + 1;
		num3 = rand.nextInt(45) + 1;
		num4 = rand.nextInt(45) + 1;
		num5 = rand.nextInt(45) + 1;
		num6 = rand.nextInt(45) + 1;
		bonusNum = rand.nextInt(45) + 1;
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + ", Bonus " + bonusNum);

	}

	private static void Q4() {
		int num[] = new int[7];
		Random rand = new Random();
		for(int i=0; i<num.length;i++) {
			num[i]=rand.nextInt(45) + 1;
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}

	private static void Q5() {
		Random rand = new Random();
		boolean overlap=false;
		int num[] = new int[7];
		
		for(int i=0; i<num.length;i++) {
			overlap=true;
			while(overlap) {	
			num[i]=rand.nextInt(45) + 1;
			overlap=check(num,i);
			}
		}
		
		for(int i=0; i<num.length-1;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println(", Bonus "+num[num.length-1]);

	}

	private static boolean check(int[] num, int checkNum) {
		for(int i=0; i<checkNum;i++) {
			if(num[i]==num[checkNum]) {
				return true;
			}
		}
		return false;
	}

	private static void Q6() {
		Random rand = new Random();
		boolean overlap=false;
		int num[] = new int[7];
		
		for(int i=0; i<num.length;i++) {
			overlap=true;
			while(overlap) {	
			num[i]=rand.nextInt(45) + 1;
			overlap=check(num,i);
			}
		}
			num=bubbleSort(num);
		for(int i=0; i<num.length-1;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println(", Bonus "+num[num.length-1]);

	}

	private static int[] bubbleSort(int[] num) {
		int temp;
		for(int i=0; i<num.length-2;i++) {
			for(int j=i+1; j<num.length-1;j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;			
				}
			}
		}
		return num;
	}


}
