package dungeongame.level2;

import java.util.Scanner;

public class Level2View {
	Level2ViewModel level2ViewModel;
	public Level2View()
	{
		level2ViewModel=new Level2ViewModel(this);
	}

	public void start() {
		System.out.println("Enter the no of Row & Col : ");
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		System.out.println("Position of Adventure : ");
		int adventureRow=scanner.nextInt();
		int adventureCol=scanner.nextInt();
		System.out.println("Position of Monter : ");
		int monsterRow=scanner.nextInt();
		int monsterCol=scanner.nextInt();
		System.out.println("position of Gold : ");
		int goldRow=scanner.nextInt();
		int goldCol=scanner.nextInt();
		int result=level2ViewModel.getResult(row,column,adventureRow,adventureCol,monsterRow,adventureCol,goldRow,goldCol);
		if(result!=0)
		{
			System.out.println("---Minimum steps to Reach Gold----");
			System.out.println(result);
		}
		else
			System.out.println("No Possible Positions..,");
		
		
	}

}
