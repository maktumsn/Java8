
@FunctionalInterface
interface StaticMethodRef {
	void say();
}

interface ConstructorRef{
	void sayConstuctor(String msg);
}

class Message{
	Message(String msg){
	System.out.println(msg);
	}
}

public class MethodReferenceTest {

	static void saySomething() {
		System.out.println("from Method reference");
	}
	
	void saySomethingelse() {
		System.out.println("from Method reference , non static method");
	}

	public static void main(String[] args) {
		StaticMethodRef obj1 = () -> System.out.println("from lambda"); // from lambda

		StaticMethodRef obj3 = () -> MethodReferenceTest.saySomething(); // from lambda but calling the method 
		

		StaticMethodRef obj2 = MethodReferenceTest::saySomething;  //from method reference

		obj1.say();
		obj2.say();
		obj3.say();
		
		MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
		
		StaticMethodRef obj4 = methodReferenceTest::saySomethingelse; // using instance variable but non-static 
		
		obj4.say();
		
		
		ConstructorRef obj5 = Message::new;
		
		obj5.sayConstuctor("hello from constructor"); // using constructor method reference
		
		
	}

}
