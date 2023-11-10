package zsgs;
import java.util.*;
public class Pattern {
	public static void main(String[] args)
	{
		int n,start=0,end,count=1,a,b,c,d,row=0,col=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number :  ");
		n=scan.nextInt();
		end=n;
		int[][] arr=new int[n][n];
		while(true)
		 {
	        for(int i=start;i<end;i++)
			 {
				arr[row++][col++]=count++;
			 }
	        for(int j=end-2;j>0;j--)
	        {
	        	arr[--row][col-1]=count++;
	        } 
	       for(int k=col-1;k>0;k--)
	       {
	    	   arr[row][col--]=count++;
	       }
	       if(count==(n*(n+1)/2))
	    	   break;
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


