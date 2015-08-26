package BasicLevel;

import java.text.DecimalFormat;
import java.util.Scanner;

public class No_1012 {
	static int a1, a2, a3, a4, a5, count1,count2;

	public static void judge(int x) {
		int n = x % 5;
		switch (n) {
		case 0:
			if(x%2==0) a1+=x;
			break;
		case 1:
			if(count1++%2==0)
				a2+=x;
			else
				a2-=x;
			break;
		case 2:
			a3++;
			break;
		case 3:
			a4+=x;
			count2++;
			break;
		case 4:
			if(x>a5) a5=x;
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ss = sc.nextLine().split(" ");
		int[] arr = new int[ss.length];
		for (int i = 1; i < ss.length; i++) {
			arr[i] = Integer.valueOf(ss[i]);
			judge(arr[i]);
		}
		 DecimalFormat d=new DecimalFormat(".#");
		 double num=(double)a4/(double)count2;
		 String result="";
		 if(a1==0){
			 result+="N"+" ";
		 }else {
			 result+=a1+" ";
		 }
		 if(a2==0){
			 result+="N"+" ";
		 }else {
			 result+=a2+" ";
		 }
		 if(a3==0){
			 result+="N"+" ";
		 }else {
			 result+=a3+" ";
		 }
		 if(a4==0){
			 result+="N"+" ";
		 }else {
			 result+=d.format(num)+" ";
		 }
		 if(a5==0){
			 result+="N";
		 }else {
			 result+=a5;
		 }
		 System.out.println(result);
	}
}
