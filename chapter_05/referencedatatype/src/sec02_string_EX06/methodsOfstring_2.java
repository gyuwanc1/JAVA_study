package sec02_string_EX06;

import java.util.Arrays;

public class methodsOfstring_2 {
	public static void main(String[] args) {
		
		//5.문자열 수정
		//@toLowerCase(), toUpperCase()
		String str1 = "java Study";
		System.out.println(str1.toLowerCase()); //소문자로
		System.out.println(str1.toUpperCase()); //대문자로
		
		//@replace(,)
		System.out.println(str1.replace("Study", "공부")); //Study를 공부로 대체
		
		//@ subString()
		System.out.println(str1.substring(0,5)); // 0<= <5 ->Java
		
		//@split()
		String[] strArray="abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray));
		
		// @trim()
		System.out.println("   abc   ".trim());
		
		//6. 문자열의 내용비교 (equals(), equalsIgnoreCase())
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		//@ stack 메오리 비교(==)
		System.out.println(str2 == str3);//false
		System.out.println(str3 == str4);//false
		System.out.println(str4 == str2);//false
		System.out.println();
		
		//@ equals(), equalsIgnoreCase() : 내용비교		
		System.out.println(str2.equals(str3));//true
		System.out.println(str3.equals(str4));//false //대소문자 비교
		System.out.println(str3.equalsIgnoreCase(str4));//true  대소문자 상관없이 내용비교

		
		
		
		
		
		
		
		
		
	}

}
