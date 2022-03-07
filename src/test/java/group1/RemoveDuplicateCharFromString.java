package group1;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		 String s ="KALPANA";
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
			//in linked hash set duplicates removed and maintains the order of insertion
			
			for(int i=0; i<s.length(); i++)
			{
				set.add(s.charAt(i));
			}
			//print each character of the set
			for (Character ch : set) 
			{
					
					System.out.print(ch);
				}
				
				
			}
		

	

}
