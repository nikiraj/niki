package guvi;

public class nonrepeat {
public static void main(String[] args) {
	{
		String s="Enginneering",str="";
		int f=0;
		for(int j=0;j<s.length();j++)
		{
			f=0;
			char a=s.charAt(j);
		for(int i=0;i<s.length();i++)
		{ 
			if(i!=j){			
			if(s.charAt(i)==a){
				f=1;
		}
	}
		}
		if(f==0)
		{
			str=str+s.charAt(j);
		}
	}
		System.out.println(str);
}
}
}

