package group2;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordFRomSentence {

	public static void main(String[] args) {
		String s ="WELCOME TO INDIA TO MANDYA";
		String[] str = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		//in linked hash set duplicates removed and maintains the order of insertion
		
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		//print each word of the string array
		for (String word : set) 
		{
				
				System.out.print(word+" ");
			}
			
	}

}
