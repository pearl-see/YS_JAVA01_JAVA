package ch02.sec13;
import java.util.Scanner;

public class Scanner예시 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값 입력:");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y값 입력:");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x+y;
		System.out.printf("%d + %d = %d\n",x,y,x+y);
		System.out.printf("%d - %d = %d\n",x,y,x-y);
		System.out.printf("%d * %d = %d\n",x,y,x*y);
		System.out.printf("%d / %d = %f\n",x,y,(double)x/y);
	}

}
