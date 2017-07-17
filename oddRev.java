package guvi;
import java.util.*;
public class oddRev {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str=s.nextLine();
	String str2="";
	String str1[]=str.split(" ");
int 	b=str1.length;
for(int i=0;i<b;i++)
{
	if(i%2==1)
	{
		
		str2=str2+str1[i]+" ";
	}
	else
	{
		StringBuffer sb=new StringBuffer(str1[i]);
		sb.reverse();
        str2=str2+sb.toString()+" ";
		
	}
}
System.out.println(str2);

}

}