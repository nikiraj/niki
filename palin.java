package guvi;

import java.util.Scanner;

public class palin {
public static void main(String[] args) {
	String s;
	Scanner in=new Scanner(System.in);
	s=in.next();
	int max=0;
    StringBuffer t=new StringBuffer(s);
    StringBuffer r1=new StringBuffer();
    StringBuffer r2=new StringBuffer();
    StringBuffer p=new StringBuffer();

    for(int i=0;i<t.length();i++)
    {
    	for(int j=i+1;j<=t.length();j++)
    	{
    		r1=new StringBuffer(t.substring(i,j));
    		r2=new StringBuffer(t.substring(i,j));
    		r2.reverse();

    		if((r1.toString()).equals(r2.toString()) && r1.length()>2)
    		{
    		    System.out.print(r1+" ");

    		}
		    //System.out.println();

    		
    	}
    	
    }
    System.out.println(p);

    
}
}
