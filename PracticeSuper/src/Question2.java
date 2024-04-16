class C{
	void eat() {
		System.out.println("I am eating");
	}
}
class D extends C{
	void sing() {
		System.out.println("I am Singing");
	}
	void dance() {
		System.out.println("I am Dancing");
	}
	void work() {
		super.eat();
		sing();
	}

}
public class Question2 {
			public static void main(String args[]) {
				D obj=new D();
				obj.work();
			}
}
