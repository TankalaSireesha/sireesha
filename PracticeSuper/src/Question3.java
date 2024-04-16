class E{
	E(){
		System.out.println("Welcome to Java");
	}
}
class F extends E{
	F(){
		super();
		System.out.println("This is Programming Language");
		
	}
}
public class Question3 {
		public static void main(String args[]) {
			F obj=new F();
		}
}
