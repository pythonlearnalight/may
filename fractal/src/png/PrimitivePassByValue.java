package png;
public class PrimitivePassByValue {
	
	public static int  modifyValue(int a, int b) {
        int x= a + b;
        System.out.println(x);
        return x;  
    }
	
    public static void main(String[] args) { 
      int z;
      z=  modifyValue(2,4); 
      System.out.println(z);
    }
    
    
}
