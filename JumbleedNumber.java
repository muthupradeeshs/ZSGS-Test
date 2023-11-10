package zsgs;
import java.util.*;
public class JumbleedNumber {
	public static void main(String[] args)
	{
		int n,temp,i,res;
		System.out.print("Enter the number : ");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		res=n;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		while(n>0)
		{
			temp=n%10;
			n=n/10;
			arr.add(temp);
		}
		for(i=0;i<arr.size()-1;i++)
		{
			if(Math.abs(arr.get(i)-arr.get(i+1))<=1)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		if(i==arr.size()-1)
		{
			System.out.print(res+" is a jumbled Number");
		}
		else
		{
			System.out.print(res+" is not a jumbled number");
		}
	}

}
