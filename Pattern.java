package zsgs;
import java.util.*;
public class pattern1 {
	public static void main(String[] args)
	{
		int n;
		System.out.print("Enter the number : ");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int count=1,start=0,end=n-1,first=0,last=(n-1),totalCount;
		int[][] arr=new int[n][n];
		totalCount=n*(n+1)/2;
		while(count<=totalCount)
		{
			for(int i=start;i<=end;i++)
			{
				arr[i][first]=count++;
			}
			first++;
			end--;
			for(int i=end;i>=start;i--)
			{
				arr[i][last]=count++;
			}
			last--;
			for(int j=last;j>=first;j--)
			{
				arr[start][j]=count++;
			}
			start++;
			end--;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
