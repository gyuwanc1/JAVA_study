package sec05_thismethod_EX03;

class D {
	int m=3;
	int n=5;
	
	void anc(int m, int n) {
		m= this.m;
		System.out.println(m);
		n= n;
		System.out.println(n);
					
	}
	
}

public class exampl02 {
	public static void main(String[] args) {
		
		D a= new D();
		a.anc(7,8);
		
		
		
		
		System.out.println(a.m);
		System.out.println(a.n);
	}
	

	

}
