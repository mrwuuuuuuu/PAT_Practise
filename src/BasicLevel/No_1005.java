package BasicLevel;

import java.util.LinkedList;
import java.util.Scanner;

/**http://www.patest.cn/contests/pat-b-practise/1005
 * @author lenovo
 *
 */
public class No_1005 {
	public static LinkedList<String> sort(LinkedList<String> list){
		boolean flag=true;
		for(int i=list.size()-1;i>0&&flag;i--){
			flag=false;
			for(int j=0;j<i;j++){
				if(Integer.valueOf(list.get(j))>Integer.valueOf(list.get(j+1))){
					String temp=list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
					flag=true;
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.valueOf(sc.nextLine());
		
		LinkedList<String> list=new LinkedList<String>();
		
 		String str=sc.nextLine();
		String[] ss=str.split(" ");
		
		for(int i=0;i<n;i++){
			list.add(ss[i]);
		}
		
		for(int i=0;i<list.size();i++){
			int x=Integer.valueOf(list.get(i));
				
			while(x>1){
				if(x%2==0){
					x/=2;
					if(list.contains(String.valueOf(x)))
						list.set(list.indexOf(String.valueOf(x)), "-1");
				}
				else{
					x=(3*x+1)/2;
					if(list.contains(String.valueOf(x)))
						list.set(list.indexOf(String.valueOf(x)), "-1");
				}
			}
		}
		LinkedList<String> newList=sort(list);
		String an="";
		for(int i=list.size()-1;i>=0;i--){
			if(!list.get(i).equals("-1"))
				an+=list.get(i)+" ";
		}
		System.out.println(an.trim());
	}
}
