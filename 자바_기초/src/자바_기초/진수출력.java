package �ڹ�_����;

public class ������� {

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
		
		//System.out.println("���ڿ� ������ -> int : " + Integer.valueOf(a, 2));�̰͵��� string�� ���� ��� ����	
        //System.out.println("���ڿ� 8����  -> int : " + Integer.valueOf(b, 8));
        //System.out.println("���ڿ� 16���� -> int : " + Integer.valueOf(c, 16));
		
		System.out.println("10����"+a);
		
		System.out.println("2����"+Integer.toBinaryString(b)+" "+b);

		System.out.println("8����"+Integer.toOctalString(c)+" "+c);
		
		System.out.println("16����"+Integer.toHexString(d)+" "+d);
		//System.out.println(d);
		
		System.out.println(a1+" "+b1+" "+c1+" "+d1);
		System.out.println(a2+" "+b2+" "+c2+" "+d2);
	}

}
