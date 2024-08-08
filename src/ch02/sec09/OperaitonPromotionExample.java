package ch02.sec09;

public class OperaitonPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteResult = 10+20;
		System.out.println(byteResult);
		
		
		byte v1 =10;
		byte v2 = 20;
		byteResult = (byte) (v1+v2);
		int intResult = v1+v2;

		System.out.print(byteResult);
		System.out.print(intResult);
		
		byte v3 =10;
		int v4 = 100;
		long v5 = 1000L;
		short shortResult = (short) (v3+v4+v5);
		long longResult = v3+v4+v5;
		System.out.print(longResult);
			
		
		char v6 = 'A';
		char v7 = 1;
		char charresult = (char) (v6+v7);
		intResult = v6+v7;
		
		int v8 = 10;
		intResult = 10/4;
		System.out.print(intResult);
		
		
		int v9 = 10;
		double doubleResult = v9/4.0;
		System.out.print(doubleResult);
		
		
		int v10=1;
		int v11=2;
		doubleResult = (double)v10/v11;
		System.out.print(doubleResult);
		
		
	}

}
