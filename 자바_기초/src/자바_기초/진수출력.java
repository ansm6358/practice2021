package 자바_기초;

public class 진수출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,a1,b1,c1,d1,a2,b2,c2,d2;
		a=17;
		b=0b10001;
		c=0021;
		d=0x11;
		
		a1=a<<1;
		b1=b<<1;
		c1=c<<1;
		d1=d<<1;
		
		a2=a>>1;
		b2=b>>1;
		c2=c>>1;
		d2=d>>1;
		
		//System.out.println("문자열 이진수 -> int : " + Integer.valueOf(a, 2));이것들은 string일 때만 사용 가능	
        //System.out.println("문자열 8진수  -> int : " + Integer.valueOf(b, 8));
        //System.out.println("문자열 16진수 -> int : " + Integer.valueOf(c, 16));
		
		System.out.println("10진수"+a);
		
		System.out.println("2진수"+Integer.toBinaryString(b)+" "+b);

		System.out.println("8진수"+Integer.toOctalString(c)+" "+c);
		
		System.out.println("16진수"+Integer.toHexString(d)+" "+d);
		//System.out.println(d);
		
		System.out.println(a1+" "+b1+" "+c1+" "+d1);
		System.out.println(a2+" "+b2+" "+c2+" "+d2);
	}

}
