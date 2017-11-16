
public class quicksort {
	
	/*public static void main(String s[])
	{
		int x[]={ 56,28,49,88,25,13,125,0,-12};
		quickSort(x,0,8);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
	}*/
	int count=0;
	public int quickSort(int arr[],int left,int right)
	{
		count=0;
	    if (left < right)
	    {
	        int sp = split(arr, left, right);

	        count+=quickSort(arr, left, sp - 1); 
	        count+=quickSort(arr, sp + 1, right);
	    }
	    return count;
	}
	
	public int split (int arr[],int left,int right)
	{
	    int pivot = arr[left];  
	 
	    int sp = left;

	    for (int i = left+1; i <= right; i++)
	    {
	    	count++;
	        if (arr[i] < pivot)
	        {
	            sp++;    // increment index of smaller element
	            int temp=arr[i];
	            arr[i] = arr[sp];
	            arr[sp] = temp;       
	        }
	    }
	    int t=arr[left];
	    arr[left]=arr[sp];
	    arr[sp]= t;
	    return sp;
	}
}
