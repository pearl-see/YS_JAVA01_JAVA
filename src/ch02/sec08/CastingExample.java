package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int intValue = 10;
				byte byteValue = (byte)intValue;
				System.out.println(intValue + "->"+byteValue);
	
				intValue = 128; byteValue = (byte)intValue;
				System.out.println(intValue + "->"+byteValue);
	

				intValue = 256; byteValue = (byte)intValue;
				System.out.println(intValue + "->"+byteValue);
	}

}
