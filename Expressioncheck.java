package zsgs;
import java.util.*;

public class Expressioncheck {
	public static void main(String[] args)
	{
		int count=0;
		boolean flag=true;
		String str;
		System.out.print("Enter the Expression: ");
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			count++;
			else if(str.charAt(i)==')')
			count--;
			else if(str.charAt(i)=='+')
			{
				if((str.charAt(i-1)>96 && str.charAt(i-1)<=122)&&(str.charAt(i+1)>96 && str.charAt(i+1)<=122))
					flag=true;
				else
				{
					flag=false;
					break;
				}
			}
		    else if(str.charAt(i)=='-')
		    {
			if((str.charAt(i-1)>96 && str.charAt(i-1)<=122)&&(str.charAt(i+1)>96 && str.charAt(i+1)<=122))
              {
				flag=true;
              }
			else
			{
				flag=false;
				break;
			}
					
				
			}
		}
		if (count==0 && flag)
		{
			System.out.print("Valid");
		}
		else
			System.out.print("Invalid");
		
	}

}

