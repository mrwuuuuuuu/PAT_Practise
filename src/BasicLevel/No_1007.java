package BasicLevel;

import java.util.Scanner;

public class No_1007 {
	 public static boolean isPrime(int a) {  
	        boolean flag = true;  
	        if (a < 2) {// ������С��2  
	            return false;  
	        } else {  
	            for (int i = 2; i <= Math.sqrt(a); i++) {  
	                if (a % i == 0) {// ���ܱ���������˵����������������false  
	                    flag = false;  
	                    break;// ����ѭ��  
	                }  
	            }  
	        }  
	        return flag;  
	    }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=3;(num%2==0&&i<=num-3)||(num%2!=0&&i<=num-2);i+=2){
			if(isPrime(i)&&isPrime(i+2))
				count++;
		}
		System.out.println(count);
	}
}
