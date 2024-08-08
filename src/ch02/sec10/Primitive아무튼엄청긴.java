package ch02.sec10;

public class Primitive아무튼엄청긴 {
	public static void main(String[] args) {
		int intValue = Integer.parseInt("10");
		System.out.println(intValue+1);
		
		double doubleValue = Double.parseDouble("10.123");
		System.out.println(doubleValue);
		
		boolean boolValue = Boolean.parseBoolean("True");
		System.out.println(boolValue);

		String strTempo = String.valueOf(10);
		System.out.println(strTempo+10);
		
		strTempo = String.valueOf(3.14);
		System.out.println(strTempo+10);

		strTempo = String.valueOf(true);
		System.out.println(strTempo+10);
		
		
//		함수 바깥에서 만든 변수는 함수 안에서도 가넝
//		함수 안에서 만든거 밖으로 불가넝
	}
}
