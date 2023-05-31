package sec02_staticmodified.EX04;

//정적 초기화 블록
class A{
	int a;
	static int b;
	
	static {
		b=5;// 스테틱필드의 초기화는 static{} 내에서 수행		
		
	}
	
	A(){
		a=3;// 인스턴스 필드 초기화는 생성자에서 일반적으로 수행		
	}
}

public class StaticInitialBlock {
	public static void main(String[] args) {
		
		System.out.println(A.b); //5
		
	}

}
