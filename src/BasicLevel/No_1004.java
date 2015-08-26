package BasicLevel;

import java.util.Scanner;

class Student{
	
	String name;
	String sno;
	int score;
	
	public Student(){}
	public Student(String name, String sno, int score) {
		this.name = name;
		this.sno = sno;
		this.score = score;
	}
	
}
public class No_1004 {
	public static Student[] sort(Student[] stu){
		boolean flag=true;
		for(int i=stu.length-1;i>0&&flag;i--){
			flag=false;
			for(int j=0;j<i;j++){
				if(stu[j].score>stu[j+1].score){
					Student temp=stu[j];
					stu[j]=stu[j+1];
					stu[j+1]=temp;
					flag=true;
				}
			}
		}
		return stu;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.valueOf(sc.nextLine());
		Student[] stu=new Student[n];
 		for(int i=0;i<n;i++){
			String str=sc.nextLine();
			String[] ss=str.split(" ");
			stu[i]=new Student(ss[0], ss[1], Integer.valueOf(ss[2]));
		}
 		
 		Student[] newStu=sort(stu);
 		System.out.println(stu[n-1].name+" "+stu[n-1].sno);
 		System.out.println(stu[0].name+" "+stu[0].sno);
	}

}
