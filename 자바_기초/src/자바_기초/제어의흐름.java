package 자바_기초;

public class 제어의흐름 {

	public static void main(String[] args) {
		
		if_1();
		switch_1();
		while_1();
		do_while();
		break_1();
		break_label();
		continue_1();
		continue_label();
			
		
	}

	private static void continue_label() {
		System.out.println("continue_label");
		label2: for(int i=0; i<3; i++) {
			System.out.println("밖:"+i);
			for (int j = 0; j<3; j++) {
				if(j==1) {
					continue label2;
				}
				System.out.println(" 안:"+j);

			}
		}
	}

	private static void continue_1() {
		System.out.println("continue_1");
		for(int i=0; i<3; i++) {
			System.out.println("밖:"+i);
			for (int j = 0; j<3; j++) {
				if(j==1) {
					continue;
				}
				System.out.println(" 안:"+j);

			}
		}
	}

	private static void break_label() {
		System.out.println("break_label");
		label1: for(int i=0; i<3; i++) {
			System.out.println("밖:"+i);
			for (int j = 0; j<3; j++) {
				System.out.println(" 안:"+j);
				if(j==1) {
					break label1; //break에서는 라벨 쓴 부분을 나옴
				}
			}
		}
	}

	private static void break_1() {
		System.out.println("break_1");
		for(int i=0; i<3; i++) {
			System.out.println("밖:"+i);
			for (int j = 0; j<3; j++) {
				System.out.println(" 안:"+j);
				if(j==1) {
					break;
				}
			}
		}
	}

	private static void do_while() {
		//do-while
		int sum=0;
		int i=0;
		 do  {
				sum=sum+i;
				i++;
			} while(i<=10);
		 System.out.println(sum);			
	}

	private static void while_1() {
		 
		int sum=0;
		int i=0;
		//while
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		 System.out.println(sum);
		 	
	}

	private static void switch_1() {
		//switch
				int num =2;
				 switch (num) {
				 case 1:
					 System.out.println("num은 1");
					 break;
				 case 2:
					 System.out.println("num은 2");
					 break;
				 case 3:
					 System.out.println("num은 3");
					 break;
				 default:
					 System.out.println("num은 1~3이 아님");
				 }	
				 
				 int sum = 0;
				 for(int i=0; i<=10; i++) {
					 sum=sum+i;
				 }
				 System.out.println(sum);		
	}

	private static void if_1() {
		//if
		boolean b = true;
		if(b) {
			System.out.println("b는 참");
		} else {
			System.out.println("b는 거짓");				
		}
				
	}
	
	
	
}
