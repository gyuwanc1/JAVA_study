package sec02_Loopcontrol_EX01;

public class ForControl {
	public static void main(String[] args) {
		
		
		//1.for 기본문법구조
		int a ;
		for(a=0; a<3; a++) {
			System.out.print(a + " ");
		}//0,1,2
		
		System.out.println();
		
		for (int i=0;i<3;i++) {
			System.out.print(i + " ");
		}//0,1,2
		System.out.println();
		
		
		for (int i =0; i<100 ; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for( int i =10; i>0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i=0; i<10 ; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i=0, j=0; i<10 ; i++,j++) {
			System.out.print(i + j+ " ");
		}	
		
		
		//2. for문의 특수한 형태 (무한루프)
		
		//3.무한루프 탈출(break)
	}
}
