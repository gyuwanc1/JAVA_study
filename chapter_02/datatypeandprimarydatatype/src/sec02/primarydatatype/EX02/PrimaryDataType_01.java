package sec02.primarydatatype.EX02;

public class PrimaryDataType_01 {
	public static void main(String[] args) {
		
		//1.boolean : true / false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		//2. 정수 (byte, short, int,long) : 음의정수,0,양의정수
		byte value1 = 0;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		//3. 실수 (float, double) : 음의 실수,0,양의실수
		float value5 = 1.2F;
		double value6 = -1.5;
		double value7 = 5;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7); //5.0
		
	}

}
