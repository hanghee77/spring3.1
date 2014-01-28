package springbook.user.dao;

public abstract class Super {
	public void templateMethod() {
		// 기본 알고리즘 코드
		hookMethod();
		abstractMethod();
	}
	
	protected void hookMethod() {}	//선택적으로 오버라이드 가능한 훅 메서드 
	public abstract void abstractMethod(); //서브클래스에서 반드시 구현해야 하는 추상메서드 
		
}
