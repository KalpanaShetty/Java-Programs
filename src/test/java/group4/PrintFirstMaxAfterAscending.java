package group4;

public class PrintFirstMaxAfterAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,60,65,48,20,15};
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i]>arr[j]) //condition to check which number is greater
				{
					int temp =arr[i]; //use temp variable to store greater values
					arr[i]=arr[j];    //swapping
					arr[j]=temp;
					
				}
				
			}
			
		}//after sorting in ascending
	
			System.out.println(arr[arr.length-1]);	//first max element
		
		System.out.println(arr[arr.length-2]);   //second max element

	}

	}


