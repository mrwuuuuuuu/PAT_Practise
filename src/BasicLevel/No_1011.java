package BasicLevel;

import java.io.IOException;
import java.util.Scanner;

/**没有通过PAT的OJ，但是通过了牛客网的OJ
 * PAT：http://www.patest.cn/contests/pat-b-practise/1011
 * 牛客网：http://www.nowcoder.com/pat/6/problem/4077
 * @author Vincent
 */
public class No_1011 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String[] str=new String[N];
		long A,B,C;
		for(int i=0;i<N;i++){
			A=sc.nextLong();
			B=sc.nextLong();
			C=sc.nextLong();
			
			if(A+B>C){
				str[i]="Case #"+(i+1)+":"+" true";
			}else {
				str[i]="Case #"+(i+1)+":"+" false";
			}
		}
		for(String s:str)
			System.out.println(s);
	}
}
