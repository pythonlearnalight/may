package png;

public class Student {

	int a;
	
	public void aman() {
		System.out.println("aman");
	}
	
	public static void main(String[] args) {
		Student abc = new Student();
		abc.aman();
		abc.a=10;
		System.out.println(abc.a);
	}

}
