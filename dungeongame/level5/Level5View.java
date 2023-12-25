package dungeongame.level5;

import java.util.Scanner;

import dungeongame.level5.Level5ViewModel;

public class Level5View {
	Level5ViewModel level5ViewModel;
	public Level5View()
	{
		level5ViewModel=new Level5ViewModel(this);
	}

	public void start() {
		System.out.println("Enter the no of Row & Col : ");
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		level5ViewModel.toCreateArray(row,column);
		System.out.println("Position of Adventure : ");
		int adventureRow=scanner.nextInt();
		int adventureCol=scanner.nextInt();
		System.out.println("position of Gold : ");
		int goldRow=scanner.nextInt();
		int goldCol=scanner.nextInt();
		System.out.println("Enter the no of pits : ");
		int n=scanner.nextInt();
		level5ViewModel.getpits(n);
		int result=level5ViewModel.getResult(row,column,adventureRow,adventureCol,goldRow,goldCol);
		if(result!=0)
		{
			System.out.println("---Minimum steps to Reach Gold----");
			System.out.println(result);
		}
		else
			System.out.println("No Possible Positions..,");
		
		
	}

}

