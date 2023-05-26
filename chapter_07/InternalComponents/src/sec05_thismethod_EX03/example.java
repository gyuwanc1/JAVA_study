package sec05_thismethod_EX03;

import java.util.Arrays;

class A {
	void abc(int m) {
		m=8;
	}
	void bcd(int[] n) {
		n[0]=4;
		n[1]=5;
		n[2]=6;
	}
	
}

public class example {
	public static void main(String[] args) {
		
		A a = new A();
		
		int m=5;
		int[] n= {1,2,3};
		System.out.println(Arrays.toString(n));
		a.abc(m);
		a.bcd(n);
		
		System.out.println(m);
		System.out.println(Arrays.toString(n));
		
		
	}

}
