//(((((10+2)+2)-2)*2)/2)
package png;

public class baad {
	
	
	public int add(int a, int b) {
		int c;
		c= a+b;
		return c;
	}
	
	public int sub(int a, int b) {
		int c;
		c= a-b;
		return c;
	}
	
	
	public int mul(int a, int b) {
		int c;
		c= a*b;
		return c;
	}
	
	public int div(int a, int b) {
		int c;
		c= a/b;
		return c;
	}
	

	public static void main(String[] args) {
		baad abc= new baad();
		int addition = abc.add(10,2);
		
		int addi = abc.add(addition, 2);
		System.out.println(addi);
		int subi= abc.sub(addi, 2);
		System.out.println(subi);
		
		int muli= abc.mul(subi, 2);
		System.out.println(muli);
		
		int divi= abc.div(muli, 2);
		System.out.println(divi);

	}

}
