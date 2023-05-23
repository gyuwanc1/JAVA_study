package sec02_method_EX05;

import java.util.Arrays;

public class EffectOfReferenceDataArgu {
	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3};
		
		modifyData(array);
		printArrays(array);
	}
	
	public static void modifyData(int[] a) {
		a[0]=4;
		a[1]=5;
		a[2]=6;
	}
	
	public static void printArrays(int[] a) {
		System.out.println(Arrays.toString(a));
		
	}// 참조자료형은 번지값이 가르키고 있는 것에 대해 값이 바뀌기 때문에 변경됨

}
