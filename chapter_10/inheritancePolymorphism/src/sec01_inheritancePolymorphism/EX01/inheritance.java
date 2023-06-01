package sec01_inheritancePolymorphism.EX01;

class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
}

class Student extends Human{
	int studentID;
	void goToSchool() {}
}

class Worker extends Human{
	int WorkerID;
	void goToWork() {}
	
}

public class inheritance {
	public static void main(String[] args) {
		
		//1. Human 객체생성.
		Human h = new Human();
		h.name= "조규완";
		h.age=15;
		h.eat();
		h.sleep();
				
		//2. Student 객체 생성
		Student s= new Student();
		s.name="조규완";
		s.age=15;
		s.studentID=128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		//3. Worker 객체 생성
		Worker w = new Worker();
		w.name="김현지";
		w.age=30;
		w.WorkerID=128;
		w.eat();
		w.sleep();
		w.goToWork();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
