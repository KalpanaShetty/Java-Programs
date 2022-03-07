package group4;

public class PrintFirstMinAfterAscending {

	public static void main(String[] args) {
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
			
		}
		
		System.out.println(arr[0]);  //first min
		System.out.println(arr[1]);  //second min
	}


	}


