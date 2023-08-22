package 자바_기초;

import java.util.Scanner;

public class 연습문제2 {

	public static void main(String[] args) {
//		P73Q11();
//		P73Q12();
//		P74Q13();
//		P75Q14();
//		P75Q15();
//		P76Q16();

	}

	private static void P76Q16() {
		int count=0;
		do {	
			System.out.println("Welcome to  java");
			count++;
		}while (count<2);
	}

	private static void P75Q15() {
		int count=0;
		while (count<2) {
			System.out.println("Welcome to  java");
			count++;
		}
	}

	private static void P75Q14() {
		for(int i=0;i<2;i++) {
			System.out.println("Welcome to  java");
		}
	}

	private static void P74Q13() {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char scoreRate;
		 switch (score/10) {
		 case 10:
			 scoreRate ='A';
			 break;
		 case 9:
			 scoreRate ='A';
			 break;
		 case 8:
				scoreRate ='B';
				 break;
		 case 7:
				scoreRate ='C';
				 break;
		 case 6:
				scoreRate ='D';
				 break;
		default:
				scoreRate ='F';
		 }
			System.out.println("등급: "+scoreRate);

	}

	private static void P73Q12() {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char scoreRate;
		
		if(score<60) {
			scoreRate ='F';
		} else if(score<70) {
			scoreRate ='D';
		} else if(score<80) {
			scoreRate ='C';
		} else if(score<90) {
			scoreRate ='B';
		} else if(score<100) {
			scoreRate ='A';
		} else {
			scoreRate='?';
		}
		System.out.println("등급: "+scoreRate);
	}

	private static void P73Q11() {
		int a=5, b=7, max;
		if(a>b) {
			max=a;
		} else {
			max=b;
		}
		System.out.println(max);
	}

}
