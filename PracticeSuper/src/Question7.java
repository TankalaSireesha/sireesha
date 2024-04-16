class J{
	int id;
	int age;
	String name;
	float salary;
	J(int id,int age,String name){
		this.id=id;
		this.age=age;
		this.name=name;
	}
	J(int id,int age,String name,float salary){
		this(id,age,name);
		this.salary=salary;
	}
	void dis() {
		System.out.println(id+" "+age+" "+name+" "+salary);
	}
}
public class Question7 {
			public static void main(String args[]) {
				J obj1=new J(101,26,"abc");
				J obj2=new J(102,30,"def",15000);
				obj1.dis();
				obj2.dis();
				
				
			}
}
