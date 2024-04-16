class N{
	N getN() {
		return this;
	}
void dis() {
	System.out.println("Welcome to java");
}
}
public class Question10 {
	public static void main(String args[]) {
		new N().getN().dis();
	}
}
