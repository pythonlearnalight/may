package png;
public class ExampleClass {
	public int add(int a,int b)
	{
		return a + b;
	}
	public  int sub (int c,int d) {
		int tt;
		tt =c - d;
		return tt;
		
		//or we can write only
		//return c-d;
	}
	public int mul (int x, int y) {
		
		int dd;
		dd= x*y;
		return 	dd;
		
		//or we can write only
		//return x*y;
	}
	public static void main(String[] args) {
			
		ExampleClass ob = new ExampleClass();
		int addition = ob.add(10, 20);
		int subtraction = ob.sub(10, 5);
		
		int ss = ob.mul(addition, subtraction);
		System.out.println(ss);
		
	}
		
}
