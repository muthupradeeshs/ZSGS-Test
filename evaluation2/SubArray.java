package evaluation2;
import java.util.Scanner;
import java.util.*;
public class SubArray {
	public static void main(String4[] args)
	{
		int n,start=0,end=0;
		int sum=Integer.MIN_VALUE;
		ArrayList<Integer> result=new ArrayList<Integer>();
		System.out.print("Enter the no of element In Array : ");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		   arr[i]=scanner.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int tempSum=0;
			for(int j=i;j<arr.length;j++)
			{
				tempSum+=arr[j];
				if(tempSum>sum)
				{
					sum=tempSum;
					start=i;
					end=j;
				}
			}
		}
		for(int i=start;i<=end;i++)
		{
			result.add(arr[i]);
		}
		System.out.println(result);
		
		
	}

}





