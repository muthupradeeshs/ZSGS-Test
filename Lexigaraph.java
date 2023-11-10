package zsgs;
import java.util.*;

public class Lexigaraph {
	public static void main(String[] args) 
	{
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int n=scan.nextInt();
	 String[] arr=new String[n];
	 for (int i=0;i<n;i++) 
	{
	  System.out.print("Enter the string" + (i + 1) + ":");
	  arr[i]=scan.next();
	}
	 for(int j=0;j<n;j++)
	 {
		String str=arr[j];
	   char[] charArr= str.toCharArray();
	   Arrays.sort(charArr);
	   String result = "";
	   for (int i= charArr.length - 1; i >= 0; i--)
	 {
		result += charArr[i];
	 }
	    System.out.println(result);
	 }
	    
	    

}

}
