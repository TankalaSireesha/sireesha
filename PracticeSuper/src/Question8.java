class K{
	void dis(K n) {
		System.out.println("Pass argument in method");
	}
	void dis1() {
		dis(this);
	}
}
public class Question8 {
		public static void main(String args[]) {
			K obj=new K();
			obj.dis1();
		}
}
