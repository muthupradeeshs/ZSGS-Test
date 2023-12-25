package dungeongame.level6;

import java.util.Scanner;

import dungeongame.level6.Level6ViewModel;

public class Level6View {
	Level6ViewModel level6ViewModel;
	public Level6View()
	{
		level6ViewModel=new Level6ViewModel(this);
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
		System.out.println("position of Trigger : ");
		int triggerRow=scanner.nextInt();
		int triggerCol=scanner.nextInt();
		System.out.println("position of Gold : ");
		int goldRow=scanner.nextInt();
		int goldCol=scanner.nextInt();
		int result=level6ViewModel.getResult(row,column,adventureRow,adventureCol,monsterRow,monsterCol,triggerRow,triggerCol,goldRow,goldCol);
		if(result!=0)
		{
			System.out.println("---Minimum steps to Reach Gold----");
			System.out.println(result);
		}
		else
			System.out.println("No Possible Positions..,");
		
		
	}

}


