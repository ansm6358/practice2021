package �ڹ�_����;

public class ��������1 {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		String str="("+a+","+b+")";
		System.out.println("("+a+","+b+")");
		System.out.println(str);
		
		int cnt1=10;
		int cnt2=10;
		int k1=0;
		int k2=0;
		k1=cnt1++%2;
		k2=++cnt2%2;
		
		System.out.println(cnt1+","+k1);
		System.out.println(cnt2+","+k2);
	}

}
