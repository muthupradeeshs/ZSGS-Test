package mentor;

import java.util.Scanner;

public class BestSellTime {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the no ofelement in array : ");
//		Scanner scanner=new Scanner(System.in);
//		int n=scanner.nextInt();
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=scanner.nextInt();
//		}
		int[] arr= {7,1,5,3,6,4};
		int max=0;
		int target;
		for(int i=0;i<arr.length;i++)
		{
			target=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(target<arr[j]&& max<(arr[j]-target))
				{
					max=arr[j]-target;
				}
			}
		}
		System.out.println("Result : "+max);
	}

}
