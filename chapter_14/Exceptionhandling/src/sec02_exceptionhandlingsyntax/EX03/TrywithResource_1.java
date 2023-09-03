package sec02_exceptionhandlingsyntax.EX03;

import java.io.IOException;
import java.io.InputStreamReader;

public class TrywithResource_1 {
	public static void main(String[] args) {
		
		//참고. system.in 리소스를 해제하면 더이상 콘솔 입력이 불가
		//자동리소스 해제
		try(InputStreamReader isr1 = new InputStreamReader(System.in);){
			char input = (char)isr1.read();
			System.out.println("입력글자는 =" + input);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		//2. 수동 리소스 해제
		InputStreamReader isr2=null;
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char)isr2.read();
			System.out.println("입력글자는 =" + input);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			
			if(isr2 !=null) {
				try {//리소스 해제구문
					isr2.close();
				} catch (IOException e) {					
					e.printStackTrace();
				}
			}
			
		}
	}

}
