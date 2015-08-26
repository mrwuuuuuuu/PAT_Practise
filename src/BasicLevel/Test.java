package BasicLevel;
public class Test
{
	static int fun(int x)
	  {
	      int countx = 0;
	      while (x!=0)
	      {
	          countx++;
	          x = x & (x-1);
	      }
	      return countx;
	  }
  public static void main(String[] args) {
	  
	  System.out.println(fun(500));
}
}