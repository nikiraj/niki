package hunter;

import java.util.Scanner;

public class zero {
	public static void main(String args)
	{
		Scanner in=new Scanner(System.in);
		int n,c=0;
		n=in.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=in.next();
		}
		for(int i=0;i<n;i++)
		{ if(s[i].length()>2)
		{
			if((s[i].charAt(0)=='0' && s[i].charAt(1)=='1') || (s[i].charAt(0)=='1' && s[i].charAt(1)=='0'))
			{
				c++;
			}
		
	     }
	    }
		System.out.print(c);
	}
	}
