package hunter;

import java.util.*;

public class subarray {
public static void main(String[] args) {
	{
		int arr[]={1,-3,5,-2,9,-8,-6,4};
		int a=0,b=0,c=0,d=0,s=0;
		for(int i=0;i<8-3;i++)
		{
			s=arr[i]+arr[i+1]+arr[i+2];
			if(s>d)
			{
				d=s;
				a=arr[i];
				b=arr[i+1];
				c=arr[i+2];
			}
		}
		System.out.println(a+" "+b+" "+c);
	}
}
}
