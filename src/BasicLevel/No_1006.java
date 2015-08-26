package BasicLevel;

import java.util.Scanner;

public class No_1006 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String result="";
		for(int i=0;i<str.length();i++){
			if(str.length()-i==3){
				for(int j=0;j<Integer.valueOf(String.valueOf(str.charAt(i)));j++){
					result+="B";
				}
			}else if(str.length()-i==2){
				for(int j=0;j<Integer.valueOf(String.valueOf(str.charAt(i)));j++){
					result+="S";
				}
			}else if(str.length()-i==1){
				for(int j=0;j<Integer.valueOf(String.valueOf(str.charAt(i)));j++){
					result+=String.valueOf(j+1);
				}
			}
		}
		System.out.println(result);
	}
}
