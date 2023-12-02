package evaluation2;

import java.util.*;

public class FrequencyOfString 
{
		public static void main(String[] args)
		{
			int count=0;
			System.out.println("Enter the String : ");
			Scanner input =new Scanner(System.in);
			String str=input.nextLine();		
			ArrayList<String> arr =new ArrayList<String>();
			ArrayList<Integer> key=new ArrayList<Integer>();
			String tempStr="";
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==' ')
				{
					arr.add(tempStr);
					tempStr="";
				}
				else 
				{
					tempStr+=str.charAt(i);
				}
		   }
			for(int i=0;i<arr.size();i++)
			{
				count=0;
				for(int j=i;j<arr.size();j++)
				{
					if(arr.get(i).equals(arr.get(j)))
					{
						count++;
					}
				}
				key.add(count);
			}
			for(int i=0;i<arr.size();i++)
			{
				if(arr.get(i).equals(arr.get(i+1)))
				{
					arr.remove(i+1);
					key.remove(i+1);
				}
			}
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i)+" - "+key.get(i));
		}

		
	}
}
