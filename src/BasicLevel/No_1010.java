package BasicLevel;

import java.util.Scanner;
/**一元多项式求导 (25)
 *PAT：http://www.patest.cn/contests/pat-b-practise/1010
 *牛客网：http://www.nowcoder.com/pat/2/problem/4076
 *
 *没有通过PAT的OJ，但是通过了牛客网的OJ
 *只能通过PAT后三个测试用例。
 *"完全无法理解 “注意“零多项式”的指数和系数都是0，但是表示为“0 0”。”这句话到底是什么鬼？
 * @author Vincent
 *
 */
public class No_1010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str1 = sc.nextLine().split(" ");
		int[] arr=new int[str1.length];
		for(int i=0;i<str1.length;i++){
			arr[i]=Integer.valueOf(str1[i]);
		}
		int count=0;
		int[] ans=new int[1024];
		for(int i=0;i<arr.length&&i+1<arr.length;i+=2){
			if(arr[i]!=0&&arr[i+1]==0) continue;
			if(arr[i]==0){
				ans[count++]=0;
				ans[count++]=0;
			}
			if(arr[i+1]!=0){
				ans[count++]=arr[i]*arr[i+1];
				ans[count++]=arr[i+1]-1;
			}	
		}
	
		if(count==0){
			System.out.println("0 0");
		}else{
			String result="";
			for(int i=0;i<count;i++){
				result+=String.valueOf(ans[i])+" ";
			}
			System.out.println(result.trim());
		}
	}
}
