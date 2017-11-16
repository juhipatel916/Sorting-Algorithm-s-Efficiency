import java.util.Random;

public class assignment2 {
	
	public static void main(String arg[])
	{
		
		System.out.println("       Quick Sort                          BubbleSort                          BST");
		System.out.println("n      av     av/n     av/n*n  av/nlog(n)  av     av/n     av/n*n  av/nlog(n)  av     av/n     av/n*n  av/nlog(n)  ");
		for(int n=1000;n<=10000;n+=100)
		{
			int totalq = 0;
			int totalb = 0;
			int totalbs = 0;
			for(int i=1;i<=30;i++)
			{
				//System.out.println("Array of "+n);
				int x[]=perm(n);
				int y[]=x.clone();
				int z[]=x.clone();
				
				
				quicksort q= new quicksort();
				int count = q.quickSort(x,0,n-1); 
				totalq+=count;
		
				BubbleSort b= new BubbleSort();
				count = b.bubbleSort(y);
				totalb+=count;
				
				BST bs = new BST();
				count=0;
				for(int j=0;j<z.length;j++)
					count+=bs.insert(z[j]);
				totalbs+=count;
				
			}
			double avq = (double)totalq/30;
			double avb = (double)totalb/30;
			double avbs = (double)totalbs/30;
			double l2n = Math.log(n)/Math.log(2);
			System.out.println();
			System.out.print(n+"   ");
			System.out.format("%6.4f",avq);
			System.out.print(n+"   ");
			System.out.format("%6.4f",avq/n);
			System.out.print("   ");
			System.out.format("%6.4f",avq/(n*n));
			System.out.print("   ");
			System.out.format("%6.4f",avq/(n*l2n));
			System.out.print("   ");
			System.out.format("%6.4f",avb);
			System.out.print("   ");
			System.out.format("%6.4f",avb/n);
			System.out.print("   ");
			System.out.format("%6.4f",avb/(n*n));
			System.out.print("   ");
			System.out.format("%6.4f",avb/(n*l2n));
			System.out.print("   ");
			System.out.format("%6.4f",avbs);
			System.out.print("   ");
			System.out.format("%6.4f",avbs/n);
			System.out.print("   ");
			System.out.format("%6.4f",avbs/(n*n));
			System.out.print("   ");
			System.out.format("%6.4f",avbs/(n*l2n));
			
		
		}
	}

	private static int[] perm(int n) {
		int ans[]= new int[n];
		Random r= new Random();
		for(int i=1;i<=n;i++)
		{
			ans[i-1]=i;
		}
		for(int k=n-1;k>=1;k--)
		{
			int j= r.nextInt(k+1);
			int temp=ans[j];
			ans[j]=ans[k];
			ans[k]=temp;
		}
		return ans;
	}

}
