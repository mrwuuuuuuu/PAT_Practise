package BasicLevel;

import java.util.Scanner;

public class No_1002 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sno=sc.next();
		int sum=0;
		for(int i=0;i<sno.length();i++){
			String s=String.valueOf(sno.charAt(i));
			int n=Integer.valueOf(s);
			sum+=n;
		}
		
		String str=String.valueOf(sum);
		for(int i=0;i<str.length();i++){
			String x=String.valueOf(str.charAt(i));
			if(i<str.length()-1){
				if(x.equals("1"))
					System.out.print("yi"+" ");
				else if (x.equals("2"))
					System.out.print("er"+" ");
				else if (x.equals("3"))
					System.out.print("san"+" ");
				else if (x.equals("4"))
					System.out.print("si"+" ");
				else if (x.equals("5"))
					System.out.print("wu"+" ");
				else if (x.equals("6"))
					System.out.print("liu"+" ");
				else if (x.equals("7"))
					System.out.print("qi"+" ");
				else if (x.equals("8"))
					System.out.print("ba"+" ");
				else if (x.equals("9"))
					System.out.print("jiu"+" ");
				else if (x.equals("0"))
					System.out.print("ling"+" ");
			}else {
				if(x.equals("1"))
					System.out.print("yi");
				else if (x.equals("2"))
					System.out.print("er");
				else if (x.equals("3"))
					System.out.print("san");
				else if (x.equals("4"))
					System.out.print("si");
				else if (x.equals("5"))
					System.out.print("wu");
				else if (x.equals("6"))
					System.out.print("liu");
				else if (x.equals("7"))
					System.out.print("qi");
				else if (x.equals("8"))
					System.out.print("ba");
				else if (x.equals("9"))
					System.out.print("jiu");
				else if (x.equals("0"))
					System.out.print("ling");
			}
		}
	}
}
