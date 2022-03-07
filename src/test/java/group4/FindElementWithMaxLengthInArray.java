package group4;

public class FindElementWithMaxLengthInArray {

	public static void main(String[] args) {
	String str[] = {"helloworld","hello","bye","hi","java","worldhello"};
	String maxLenElement = str[0];
	
	for(int i=1;i<str.length;i++){                    //str.lrngth=6
		
		if(str[i].length()>maxLenElement.length()){  // use > least length
			maxLenElement=str[i];
		}
		
	}
for (int i = 0; i <str.length; i++) {
	if(str[i].length()==maxLenElement.length()){
		System.out.println(str[i]);
	
	}
}
	}

}
