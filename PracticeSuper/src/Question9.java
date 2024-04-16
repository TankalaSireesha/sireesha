class L{
	M obj;
	L(M obj){
		this.obj=obj;
	}
	void dis() {
		System.out.println(obj.data);
	}
}
class M{
	int data=20;
	M(){
		L l=new L(this);
		l.dis();
}
}

public class Question9 {
	public static void main (String args[]) {
		M obj=new M();
}
}
