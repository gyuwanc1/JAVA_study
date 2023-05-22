package sec02_method_EX03;

import java.util.Arrays;

public class ArryArgumentMethod {
	public static void main(String[] args) {
		
		//배열을 매개변수로 가지는 메소드 호출
		printArray(new int[] {1,2,3});
		
		//printArray({1,2,3});//오류
		
	}
	
	public static void printArray(int[] a) {
//		int[] a;
//		a = new int[] {1,2,3};
		
//		int[] 1;
//		a= {1,2,3};
		
		System.out.println(Arrays.toString(a));
		
	}
}
