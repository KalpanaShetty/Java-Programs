package group1;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueCharOfString {

	public static void main(String[] args) {
     String s ="KALPANA";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) 
		{
			int count=0;
			for (int i = 0; i < s.length(); i++)
				
			{
				if (ch==s.charAt(i))
				{
					count ++;
				}
				
			}
			if(count==1){
				//System.out.println(ch+" "+count);
				System.out.print(ch);
			}
			
		}
	}

	}


