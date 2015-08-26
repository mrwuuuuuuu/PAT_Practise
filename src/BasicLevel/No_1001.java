package BasicLevel;

import java.util.Scanner;

/**
 * http://www.patest.cn/contests/pat-b-practise/1001
 * @author lenovo
 */
public class No_1001 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int count=0;
		while(n!=1){
			if(n%2==0){
				n/=2;
				System.out.print(n+" ");
			}
			else{
				n=(3*n+1)/2;
				System.out.print(n+" ");
			}
			count++;
		}
		System.out.println(":"+count);
	}
}

