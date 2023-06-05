package sec03_methodoverriding.EX04;

class A{
	protected void abc() {
		
	}
}//접근지정자의 범위가 좁으면 오버라이딩 불가능 

class B1 extends A{
	public void abc() {}
}
class B2 extends A{
	protected void abc() {}
}
//class B3 extends A{
//	void abc() {} //default 접근 지정자 ( 좁아져서 물가능)
//}
//class B4 extends A{
//	private void abc() {} //private 접근 지정자 ( 좁아져서 물가능)
//}

public class methodoverriding_4 {

}
