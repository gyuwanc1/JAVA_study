package sec02_Loopcontrol_EX03;

public class DowhileControlstatrrement {
	public static void main(String[] args) {
		
		//1. 반복회수가 0인경우 do-while과 while문 비교
		int a;
		a=0;
		while(a<0) {
			System.out.print(a + " ");
			a++;
		}//실행회수 0번
		System.out.println();
		
		a=0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a<0);//실행회수 1번
		System.out.println();
		
		//2. 반복회수가 1인경우 do-while과 while문 비교
			
		a=0;
		while(a<1) {
			System.out.print(a + " ");
			a++;
		}//실행회수 1번
		System.out.println();
		
		a=0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a<0);//실행회수 1번
		System.out.println();
		
		//3. 반복회수가 10인경우 do-while과 while문 비교
		
		a=0;
		while(a<10) {
			System.out.print(a + " ");
			a++;
		}//실행회수 10번
		System.out.println();
		
		a=0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a<10);//실행회수 10번
		
	}

}
