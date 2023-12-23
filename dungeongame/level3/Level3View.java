package dungeongame.level3;

import java.util.Scanner;


public class Level3View {
	Level3ViewModel level3ViewModel;
	public Level3View()
	{
		level3ViewModel=new Level3ViewModel(this);
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
		level3ViewModel.getResult(row,column,adventureRow,adventureCol,monsterRow,monsterCol,goldRow,goldCol);	
		
	}

}

