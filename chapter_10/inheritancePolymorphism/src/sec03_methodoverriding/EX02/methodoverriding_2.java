package sec03_methodoverriding.EX02;

class Animal{
	void cry() {}	
	
}

class Bird extends Animal{
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}

class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("야옹");
	}
}



public class methodoverriding_2 {
	public static void main(String[] args) {
		//1. 각각의 타입으로 선언 +각각의 타입으로 생성
		Animal aa =  new Animal();
		Bird bb = new Bird();
		Cat cc= new Cat();
		Dog dd = new Dog();
		
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();
		
		//2. Animal 타입으로 선언 + 자식클래스 타입으로 생성
		//(생성자 기준)
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();
		
		//3. 배열로 관리
		Animal[] animals = {ab,ac,ad};
		for (Animal animal : animals) {
			animal.cry();
		}
		
		
	}
	

}
