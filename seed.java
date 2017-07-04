package guvi;
import java.util.*;
public class seed {
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER:");
	int input=s.nextInt();
	int c=0;

	for(int i=0;i<input;i++)
	{
		int a=i;
		int b=i;
	while(a!=0)
	{
		b=b*(a%10);
		a=a/10;
	}
	if(input==b)
	{
		System.out.println("SEED IS : "+i);
		c++;
		

	}


	}
	if(c==0)
	{
		System.out.println("no seed found");
	}


	}
	}


