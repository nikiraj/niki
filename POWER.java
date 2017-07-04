package guvi;

import java.util.Scanner;

public class POWER {
public static void main(String args[])
{
	int n,num,c=0,m,mul=1,r=0,sum=0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	num=n;
	while(n>0)
	{
		n=n/10;
		c++;
	}
	while(num>0)
	{   m=0;
	    mul=1;
		r=num%10;
		while(m<c)
		{
			mul=mul*r;
			m++;
		}
		num=num/10;
		sum=sum+mul;
	}
	System.out.print(sum);
	
}

}
