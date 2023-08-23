package sec01_typeofecxeption.EX01;


class A { //extends Object
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class CheckedException {
	public static void main(String[] args) {
		// Checked Exception
		
		//1. InterruptedException
		//Thread.sleep(1000);
		
		//2. ClassNotFoundException
		//Class cls = Class.forname("java.lang.object");
		
		//3. IOException
//		InputStreamReader in = new InputStreamReader(System.in);
//		in.read();
		
		//4. FileNotFoundException
//		FileInputStream fis = new FileInputStream("text.txt");
		
		//5. CloneNotSuppetedException
		A a1 = new A();
//		A a2 = (A)a1.clone();
		
	}

}
