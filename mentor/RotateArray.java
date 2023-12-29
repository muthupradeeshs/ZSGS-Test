package mentor;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
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
		int[] arr= {1,2,3,4,5,6,7};
		int[] result=new int[arr.length];
		int index=0;
		System.out.println("Enter k :");
		int k=scanner.nextInt();
		k=k%arr.length;
		for(int i=arr.length-k;i<arr.length;i++)
		{
			result[index++]=arr[i];
		}
		for(int i=0;i<arr.length-k;i++)
		{
			result[index++]=arr[i];
		}
		System.out.println(Arrays.toString(result));
		
	}

}
