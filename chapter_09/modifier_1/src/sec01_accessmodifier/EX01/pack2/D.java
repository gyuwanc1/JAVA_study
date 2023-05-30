package sec01_accessmodifier.EX01.pack2;

import sec01_accessmodifier.EX01.pack1.A;

public class D extends A {// D클래스는 A클래스의 자식이다.
	
	public void print() {// a,b,c,d 

		
		//멤버활용
		System.out.print(a);//가능
		System.out.print(b);//가능
		//System.out.println(c);//불가능
		//System.out.println(d);//불가능
		System.out.println();
	}

	

}
