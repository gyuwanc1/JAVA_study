package sec02_typecasting.EX02;

class A{
	int m= 3;
	void abc() {
		System.out.println("A클래스");
	}
}

class B extends A{
	int n=4;
	void bcd() {
		System.out.println("B클래스");
	}
}


public class Typecasting_2 {
	public static void main(String[] args) {
		//1. A 타입  /   A 생성자
		 A aa = new A();
		 System.out.println(aa.m); //3
		 aa.abc(); //A 클래스
		 System.out.println();
		 
		 //2. B 타입  / B생성자
		 
		 B bb= new B();
		 System.out.println(bb.m);//3
		 System.out.println(bb.n);//4
		 bb.abc();//A클래스
		 bb.bcd();//B클래스
		 System.out.println();
		 
		 //3. A 타입 / B생성자 : 다형적 표현
		 A ab= new B();
		 System.out.println(ab.m);//3
		 ab.abc();//A클래스
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
