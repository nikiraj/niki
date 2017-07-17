package guvi;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class repeatRev {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		String a="",str="";
		String s=new String(sb);

		
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		for(int i=0;i<s1.length();i++)
		{
			hs.add(s.charAt(i));
		}
		
		Iterator<Character> itr=hs.iterator();
		
		while(itr.hasNext())
		{
			a=String.valueOf(itr.next());
			str=str+a;
		}
		System.out.println(str);
		
	}

}