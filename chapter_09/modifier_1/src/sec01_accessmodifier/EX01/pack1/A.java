package sec01_accessmodifier.EX01.pack1;

public class A {
	public int a =1;
	protected int b=2;// 같은 패키지에서만 사용가능 , 자기자식만 사용가능
	int c=3; //디폴그 접근 같은 패키지 안에서만 사용가능
	private int d=4; //같은 public class 안에서만 사용가능
	
	public void print() {// a,b,c,d 
		System.out.print(a);//가능
		System.out.print(b);//가능
		System.out.print(c);//가능
		System.out.print(d);//가능
		System.out.println();
	}

}
