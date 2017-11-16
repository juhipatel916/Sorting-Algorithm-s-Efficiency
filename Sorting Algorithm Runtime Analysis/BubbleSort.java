
public class BubbleSort {
	/*public static void main(String arg[])
	{
		int x[]={5,4,3,2,1};
		int ii=bubbleSort(x);
		
		System.out.println(ii);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
	}*/
	public int bubbleSort(int x[])
	{
		int count = 0;
		for(int i=x.length-1 ;i>=1;i--)
		{
			Boolean swap = false;
			for(int j=0;j<i;j++)
			{
				count++; 
				if(x[j]>x[j+1])
				{	
					swap = true;
					int temp = x[j];
					x[j] = x[j+1];
					x[j+1]=temp;
				}	
			}
			if(!swap)
				break;
		}
		return count;
	}
}
