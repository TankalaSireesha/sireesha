class H{
	H(){
		System.out.println("Constructor Calling");
	}
	H(String name){
		this();
		System.out.println(name);
	}
}
public class Question5 {
		public static void main(String args[]) {
			H obj=new H("Java");
			
		}
}
