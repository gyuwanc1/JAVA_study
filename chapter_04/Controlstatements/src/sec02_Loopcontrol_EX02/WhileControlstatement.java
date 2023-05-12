package sec02_Loopcontrol_EX02;

public class WhileControlstatement {
	public static void main(String[] args) {
		
		//1. while 의 기본 문법 구조
		//while문의 초기값은 밖에서 정의를 내리고, 증감식은 안에서 정의되어야 한다.
		int a=0;
		while(a<10) {
			System.out.println(a + " ");
			a++;
			//0,1,2,~9
		}
		System.out.println();
		
		//@for문으로 변환
		for (int i=0;i<10;i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		
		int b=10;
		while(b>0) {
			System.out.println(b+ " ");
			b--;
		}
		System.out.println();
		
		//@for문으로 변환
		for (int i=10;i>0;i--) {
			System.out.println(i + " ");
		}
		
		//2. while 의 측수한 형태(무한루프)
//		while(true) {
//			System.out.println("무한루프");
//		}
		System.out.println();
		
		
		//3. 무한루프 탈출하기 break
		int c =0;		
		while(true){
			if(c>10) {
				break;
			}
			System.out.print(c + " ");
			c++;
		}
		
	}
}
