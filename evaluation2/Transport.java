package evaluation2;

import java.util.*;

public class Transport {
	
public static void main(String4[] args)
{
	int inputRow,inputCol,outputRow,outputCol;
	System.out.println("Enter the no of Row : ");
	Scanner scanner=new Scanner(System.in);
	inputRow=scanner.nextInt();
	System.out.println("Enter the no of coloumn : ");
	inputCol=scanner.nextInt();
	int[][] inputArr=new int[inputRow][inputCol];
	int[][] outputArr=new int[inputCol][inputRow];
	for(int i=0;i<inputRow;i++)
	{
		for(int j=0;j<inputCol;j++)
		{
			inputArr[i][j]=scanner.nextInt();
		}
	}
	for(int i=0;i<inputCol;i++)
	{
		for(int j=0;j<inputRow;j++)
		{
			outputArr[i][j]=inputArr[j][i];
		}
	}
	for(int i=0;i<inputCol;i++)
	{
		for(int j=0;j<inputRow;j++)
		{
			System.out.print(outputArr[i][j]+" ");
		}
		System.out.println();
	}
}
}
