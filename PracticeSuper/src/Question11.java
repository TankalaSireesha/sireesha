class Parent{
	String name;
	Parent(String name){
		this.name=name;
	
	}
}
class Child extends Parent{
	int id;
	Child(String name){
		super(name);
		
		System.out.println(name);
	}
}
public class Question11 {
		public static void main(String args[]) {
			Child obj=new Child("Java");
		}
}
