package sec01_accessmodifier.EX01.pack1;

public class B {
	
	
	public void print() {// a,b,c,d 
		//객체생성
		A a= new A();// 객체생성 가능
		
		//멤버활용
		System.out.print(a.a);//가능
		System.out.print(a.b);//가능
		System.out.print(a.c);//가능
		//System.out.println(a.d);//불가능
		System.out.println();
	}

}
