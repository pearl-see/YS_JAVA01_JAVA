package ch02.sec09;

public class StringconcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intResult = 10+2+8;
		System.out.println(intResult);
		
		String strResult = 10+2+"8";
		System.out.println(strResult);

		strResult = 10+"2"+8;
		System.out.println(strResult);

		strResult = "10"+2+8;
		System.out.println(strResult);
		
		strResult = "10"+(2+8);
		System.out.println(strResult);
		
		int lolResult = 46+ 3+ 1;
		System.out.println(lolResult);
		
		String lllResult = "46"+3+1;
		System.out.println(lllResult);
		
		lllResult = 46+"3"+1;
		System.out.println(lllResult);
		
		lllResult = 46+3+"1";
		System.out.println(lllResult);
//		숫자 + 문자열 = 문자열 뒤의 숫자들도 문자열로 인식
	}

}
