class A{
	String color="Pink";
}
class B extends A{
	String color="Orange";
void printcolor() {
	System.out.println(color);
	System.out.println(super.color);
}
}
public class Question1 {
		public static void main(String args[]) {
			B obj=new B();
			obj.printcolor();
		}
}
