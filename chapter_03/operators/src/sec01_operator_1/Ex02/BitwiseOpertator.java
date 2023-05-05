package sec01_operator_1.Ex02;

public class BitwiseOpertator {
	public static void main(String[] args) {
		
		//0. 자바코드로 진법 변환
		int data =13;
		System.out.println(Integer.toBinaryString(data));//2진수 1101
		System.out.println(Integer.toOctalString(data));//8진수 15
		System.out.println(Integer.toHexString(data));//16진수 d
		System.out.println();
		
		System.out.println(Integer.parseInt("1101",2)); //2진수를 13
		System.out.println(Integer.parseInt("15",8)); //8진수를 13
		System.out.println(Integer.parseInt("d",16)); //16진수를 13
		System.out.println();
		
		//1. 다양한 진법 표현
		System.out.println(13);//13
		System.out.println(0b1101);//13
		System.out.println(015);//13
		System.out.println(0x0d);//13
		System.out.println();
		
		//2. 비트연산자
		//@AND 비트연산자		
		System.out.println(3 & 10);//2
		System.out.println(0b0011 & 0b1010); //0b0010 -->2
		System.out.println(0x03 & 0x0a);//2
		System.out.println();
		
		//@OR 비트연산자
		System.out.println(3 | 10);//11
		System.out.println(0b0011 | 0b1010); //0b1011 -->11
		System.out.println(0x03 | 0x0a);//11
		System.out.println();
		
		//@XOR 비트연산자
		System.out.println(3 ^ 10);//9
		System.out.println(0b0011 ^ 0b1010); //0b1001 -->9
		System.out.println(0x03 ^ 0x0a);//9
		System.out.println();
		
		//@NOT 비트연산자
		System.out.println(~3);//-4
		System.out.println(~0b0011);// 0b111...1100 -> -4
		System.out.println(~0x03);//-4
	}
}
