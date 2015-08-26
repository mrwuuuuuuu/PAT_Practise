package BasicLevel;

import java.util.Scanner;

/**http://www.patest.cn/contests/pat-b-practise/1003
 * @author lenovo
 *
 */
public class No_1003 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		String[] ss=new String[x]; 
		
		for(int i=0;i<x;i++){
			ss[i]=sc.next();
		}
		
		int m=0;
		while(m<x){
			int a=0,b=0,c=0;
			boolean flag=false;
			int bool=0;
			String str=ss[m];
			
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==80){
					a=i;
					flag=true;
				}
				if(flag){
					if(str.charAt(i)==84){
						b=i;
					}
				}
			}
			c=str.length()-1-b;
			b=b-a-1;
			if(b==0){
				System.out.println("NO");
				m++;
				continue;
			}
			
			for(int i=0;i<a;i++){
				if(str.charAt(i)!=65){
					System.out.println("NO");
					bool=1;
					break;
				}
			}
			if(bool==1) {
				m++; continue;
			}
			
			for(int i=a+1;i<b;i++){
				if(str.charAt(i)!=65){
					System.out.println("NO");
					bool=1;
					break;
				}
			}
			if(bool==1) {
				m++; continue;
			}
			
			if(a*b==c)System.out.println("YES");
			else System.out.println("NO");
			
			m++;
		}
	}	
}
