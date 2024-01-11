package selenium369;

public class Arithmetic
{            int a=10;
		     static int b=5;
		     void meth1(int c)
		     {
		    	 System.out.println("-----Arithmetic Operators-----");
		    	 int d=a+b+c;
		    	 System.out.println("Addition of:"+d);
		     }
		     public static void meth2(int e)
		     {
		    	 int f=e-b;
		    	 System.out.println("Subtraction of:"+f);
		     }
		     private void meth3(long j)
		     {
		    	 int i=100;
		    	 int k=(int)(i/j);
		    	 System.out.println("Division of:"+k);
		     }
		     long meth4(long g)
		     {
		    	 long h=b*g;
		    	 return h;
		     }
		     void meth5(int z)
		     {
		    	 int x=b%z;
		    	 System.out.println("Percentage of:"+x);
		     }
		     public static void main(String[] args) 
		     {
		    	 Arithmetic obj=new Arithmetic();
		    	 obj.meth1(24);
		    	 meth2(21);
		    	 obj.meth3(2);
		    	 System.out.println("Multiplication of:"+obj.meth4(2));
		    	 obj.meth5(2);
		    	 System.out.println("-------------------------");
		     }
		}
		
		



