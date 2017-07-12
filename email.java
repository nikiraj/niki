package hunter;
import java.util.*;
public class email {
public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			String str=s.next();
			int count=0;
			int count1=0;
			if(str.contains("@")&&str.contains("."))
			{
				for(int i=0;i<str.length();i++)
				{
					if((str.charAt(i)=='@'))
					{
						count++;
					}
					if((str.charAt(i)=='.'))
					{
						count1++;
					}
				}
				if((count==1)&&(count1==1))
				{
					
					int m=str.indexOf("@");
					int n=str.indexOf(".");
					if(str.substring(m+1,n).length()>4)
					{
						if(str.endsWith("com"))
						{
							if(str.substring(0,m).length()>3)
							{
								System.out.println("Valid email id");
							}
						}
					}
							
				}
			}
			else
			{
				System.out.println("not valid email id");
			}
	s.close();
		}

	}
