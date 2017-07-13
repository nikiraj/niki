package hunter;

import java.util.Scanner;

public class plusten {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s,s1,str="",str1="";
	s=in.next();
	s1=in.next();
	for(int i=0;i<s.length();i++)
	{
		int c=s.charAt(i)+10;
		str=str+(char)c;
	}
	for(int i=0;i<s1.length();i++)
	{
	 if(i>=1 && i<s1.length()-1)
	 {
		 int c=s1.charAt(i)+10;
		 if(c>122)
		 {
			 c=c-26;
			 
		 }
		 str1=str1+(char)c;
		 
	 }
	}
	str1=s1.substring(0,1)+str1+s1.substring(s1.length( )-1);
	System.out.println(str);
	System.out.println(str1);
}
}
