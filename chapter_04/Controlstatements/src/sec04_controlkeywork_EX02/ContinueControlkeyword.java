package sec04_controlkeywork_EX02;

public class ContinueControlkeyword {
	public static void main(String[] args) {
		
		//1. 단일 루프에서의  continue
		for(int i=0; i<10; i++) {
			continue;
			//System.out.println(i+" ");
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(i+" ");
			continue;
			
		}
		
		for(int i=0; i<10; i++) {
			
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
			//0~4,6~9
			}
		
		
		
		//2. ekwnd루프에서의  continue
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				if(j==3) {
					continue;
				}
				System.out.println(i + " " + j);
				
			}
			
		}
		System.out.println();
		System.out.println();
		
		pos1:for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				if(j==3) {
					continue pos1;
				}
				System.out.println(i + " " + j);
				
			}
			
		}
	}
}
