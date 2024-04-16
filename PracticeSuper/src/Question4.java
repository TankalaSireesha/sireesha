class G{
	void dis() {
		System.out.println("This Keyword");
	}
	void dis1() {
		System.out.println("Refers to Current Instance of class");
		this.dis();
	}
}
public class Question4 {
			public static void main(String args[]) {
				G obj=new G();
				obj.dis1();
			}
}
