package BasicLevel;

import java.util.Scanner;

/**说反话 (20)
 * http://www.patest.cn/contests/pat-b-practise/1009
 * @author Vincent
 *
 */
public class No_1009 {
	public static void reverse(String[] arr,int low,int high){
		while(low<high){
			String temp=arr[high];
			arr[high--]=arr[low];
			arr[low++]=temp;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str1 = sc.nextLine().split(" ");
		reverse(str1, 0, str1.length-1);
		String result="";
		for(String s:str1){
			result+=s+" ";
		}
		System.out.println(result.trim());
	}
}
