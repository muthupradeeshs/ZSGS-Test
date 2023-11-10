package zsgs;
import java.util.*;
public class Zigzag {
       public static void main(String[] args)
	{
		int n,i=0,j=0;
		String str;
		boolean flag=true;
		System.out.print("Enter the string : ");
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		System.out.print("Enter the number: ");
		n=scan.nextInt();
		char[][] arr=new char[n][str.length()];
		if(n== 1||n>=str.length())
		{
	       System.out.println(str);
	    }
         for(char c:str.toCharArray())
         {
	            arr[i][j]=c;
                if(flag)
                {
	                i++;
	            } 
                else
	            {
	                i--;
	                j++;
	            }

	            if(i==n-1)
	            {
	               flag=false;
	            }
	            else if(i==0) 
	            {
	                flag=true;
	            }
	      }
            for (int a=0;a<n;a++)
	        {
	            for (int b=0;b<str.length();b++)
	            {
	                if (arr[a][b]!='\0')
	                {
	                    System.out.print(arr[a][b]+" ");
	                } 
	                else
	                {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	  
		
        
		
	}

}
