package sec01_inheritancePolymorphism.EX02;

//상속관꼐 만들기

class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class polymorphism {
	public static void main(String[] args) {
		
		//1. A 타입의 다형적표현
		A a1 =  new A(); // A는 A 이다.
		A a2 =  new B(); // B는 A 이다.
		A a3 =  new C(); // C는 A 이다.
		A a4 =  new D(); // D는 A 이다.
		
		//2. B 타임의 다형적 표현
		//B b1 =  new A(); //A 는 B다  : X
		B b2 =  new B(); //A 는 B다  : O
		B b3 =  new C(); //C 는 B다  : O
		B b4 =  new D(); //D 는 B다  : O
		
		//3. C 타입의 다형적 표현
		//C c1 = new A();//A 는 C다  : X
		//C c2 = new B();//B 는 C다  : X
		C c3 = new C();//C 는 B다  : X
		//C c4 = new D();//D 는 B다  : X
		
		//4. D 타입의 다형적 표현
//		D d1=  new A(); //A 는 D이다 :X
//		D d2=  new B(); //B 는 D이다 :X
//		D d3=  new C(); //C 는 D이다 :X
		D d4=  new D(); //D 는 D이다 :X
		
		
		
	}
	
}
