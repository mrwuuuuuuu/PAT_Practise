package BasicLevel;

import java.util.Scanner;

/**http://www.patest.cn/contests/pat-b-practise/1008
 * @author lenovo
 *
 */
public class No_1008 {
	public static void reverse(int[] arr,int l,int h){
		for(;l<h;l++,h--){
			int temp=arr[l];
			arr[l]=arr[h];
			arr[h]=temp;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String[] s1=str1.split(" ");
		
		int N=Integer.valueOf(s1[0]);
		int M=Integer.valueOf(s1[1]);
		
		int[] arr=new int[N];
		String str2=sc.nextLine();
		String[] s2=str2.split(" ");
		
		for(int i=0;i<N;i++){
			arr[i]=Integer.valueOf(s2[i]);
		}
		
		reverse(arr,0,arr.length-1);
		reverse(arr, 0, M-1);
		reverse(arr, M, arr.length-1);
		
		String result="";
		
		for(int i:arr) result+=String.valueOf(i)+" ";
		System.out.println(result.trim());
	}
}
