package sec02.primarydatatype.EX06;

public class OperationBetweenDataType {
	public static void main(String[] args) {
		//1. 같은 자료형간의 연산
		int value1 = 3+5;//8
		int value2 = 8/5;//1
		float value3 = 3.0f + 5.0f;//8.0
		double value4 = 8.0/5.0;//1.6
		
		byte data1 =3;
		byte data2 = 5;
//		byte value5 = data1+data2;  바이트 + 바이트는 인트
		
		int value5 = data1 + data2;//8
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
				
		//2.다른자료형간의 연산
		
		//int value6 = 5+3.5;
		double value6 = 5+ 3.5;
		int value7 = 5 + (int)3.5;
		
		double value8 = 5/2.0;
		byte data3 = 3;
		short data4 = 5;
		int value9 = data3+ data4;
		double value10 = data3 + data4; 		
		
		System.out.println(value6); //8.5
		System.out.println(value7); //8
		System.out.println(value8); //2.5
		System.out.println(value9); //8
		System.out.println(value10); //8.0
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
