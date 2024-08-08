package ch02.sec11;

public class Variable그코프Exmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
//		int a = 17; 같은 이름 안돼~
		if(a>0) {
			int b = a+1;
//			int a = 17;/얘도 오류나요 ~
		}else {
			int b = a-1; 
//			else안의 b는 사용가능 = 오류 안나영
		}
//		int c = b+1; 바깥 b 안돼 ~
	}

}
