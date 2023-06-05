package sec03_methodoverriding.EX03;
class A {
	void print1() {
		System.out.println("A클래스 print1");
	}
	void print2() {
		System.out.println("A클래스 print2");
	}
}
class B extends A{
	@Override
	void print1() {
		System.out.println("B클래스 print1");
	}
	void print2(int a) {
		System.out.println("B클래스 print2");
	}
}

public class methodoverriding_3 {
	 public static void main(String[] args) {
		 
		 //1. A타입선언 / A생성자
		 A aa =  new A();
		 aa.print1(); // A클래스 print1
		 aa.print2(); // A클래스 pront2
		 System.out.println();
		 
		 //2. B타입 선언 / B생성자
		 B bb= new B();
		 bb.print1();//B클래스 print1
		 bb.print2();// A클래스 print2
		 bb.print2(3);//B클래스 print2
		 System.out.println();
		 
		 //3. A타입 선언 / B생성자
		 A ab = new B();
		 ab.print1(); //B클래스 print1
		 ab.print2(); //A클래스 print2
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		 
	}
}
