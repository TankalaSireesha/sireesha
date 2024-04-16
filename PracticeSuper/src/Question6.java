class I{
	I(){
		this("Java");
		System.out.println("Default Parameterized Constuctor");
	}
	I(String name){
		System.out.println(name);
	}
}
public class Question6 {
		public static void main(String args[]) {
			I obj=new I();
		}
}
