package sec01_operator_1.Ex03;

public class ShiftOperator {
	public static void main(String[] args) {
		
		
		//1.산술쉬프트 (부호변화사 없음*2, /2효과)
		//@ <<left shift
		System.out.println(3<<1);//6
		System.out.println(-3<<1);//-6
		System.out.println(3<<2);//12
		System.out.println(-3<<2);//-12
		System.out.println();
		
		//@ >> right shift
		System.out.println(5>>1);//2
		System.out.println(-5>>1);//-3
		System.out.println(5>>2);//1
		System.out.println(-5>>2);//-2
		System.out.println();
		
		//2. 논리쉬프트(>>>)
		System.out.println(3>>>1);//0000....11 -> 1
		System.out.println(-3>>>31);//1111...1101 = 1
	}

}
