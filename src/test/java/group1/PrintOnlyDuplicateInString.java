package group1;

import java.util.HashSet;

public class PrintOnlyDuplicateInString {

	public static void main(String[] args) {
		
      String s ="KALPANA";
      
		
		HashSet<Character> set = new HashSet<Character>();
		
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
			if(count>=2){
				System.out.println(ch+" "+count);
			}
			
		}
	}
	}


