package guvi;
import java.util.*;
public class addPrime {
	public static void main(String args[])
	{
int n,i,j,f=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(i=10;i<=99;i++)
{
	for(j=10;j<=99;j++)
	{
		if(i%2!=0 && j%2!=0)
		{
			if(i+j==n)
			{
			System.out.print(i+" "+j);
			f=1;
			break;
			}
		}
	}
	if(f==1)
		break;
}
	}
}
