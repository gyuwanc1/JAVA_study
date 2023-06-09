package sec06_objectclass.EX02;

class A{
	String name;
	A(String name){
		this.name= name;
	}
	public void name(String string) {
		// TODO Auto-generated method stub
		
	}
}

class B{
	String name;
	B(String name){
		this.name= name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
}

public class ObjectMethod_equals {
	public static void main(String[] args) {
		
		A a1 = new A("안녕");
		A a2 = new A("안녕");
		A a3 = new A("3");
		
		System.out.println(a1==a2); //flase
		System.out.println(a1.equals(a2));//false
		System.out.println(a3.name);
		
		
		
		
		
		B b1 = new B("안녕");
		B b2 = new B("안녕");
		
		System.out.println(b1==b2); //flase
		System.out.println(b1.equals(b2));//true
		
		
	}

}









