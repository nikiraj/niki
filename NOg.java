package guvi;

import java.util.Scanner;

public class NOg {
public static void main(String[] args) {
	String s,p,sub;
	Scanner in=new Scanner(System.in);
	s=in.next();
	int flag=0,count=0;
	sub=s.substring(1,s.length()-1);
	p=s.toLowerCase();
	if(s.charAt(0)>='n' && s.charAt(0)<='z')
	{
		if(s.charAt(s.length()-1)>='n' && s.charAt(s.length()-1)<='z')
		{
		flag=1;
		}
	}
	System.out.println(flag);
	for(int i=0;i<sub.length()-1;i++)
	{
		if((sub.charAt(i)>='a' &&sub.charAt(i)<='m') && (sub.charAt(i+1)>='a' && sub.charAt(i+1)<='m'))
		{
				count=1;
		
		}
		if(flag==2)
			break;
			
	}
	System.out.println(count);

	if(flag==1 && count==0){
		System.out.println(p+"is balanced");
	}else
		System.out.println(p+" is not balanced");

}
}