package sec01_datatype_EX03;

public class RangeOfVariableUse {
	public static void main(String[] args) {
		
		int value1 = 3;
		
		{
			int value2 = 5;
			System.out.println(value1);//3
			System.out.println(value2);//5
		}
		System.out.println(value1);//3
		//System.out.println(value2);//오류 :  범위문제
		
	}

}
