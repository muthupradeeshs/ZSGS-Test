package dungeongame.level1;

import java.util.Scanner;

public class Level1View {
	Level1ViewModel level1ViewModel;
	public Level1View()
	{
		level1ViewModel=new Level1ViewModel(this);
	}

	public void start() {
		System.out.println("Enter the no of Row & Col : ");
		Scanner scanner=new Scanner(System.in);
		int row=scanner.nextInt();
		int column=scanner.nextInt();
		System.out.println("Position of Adventure : ");
		int adventureRow=scanner.nextInt();
		int adventureCol=scanner.nextInt();
		System.out.println("position of Gold : ");
		int goldRow=scanner.nextInt();
		int goldCol=scanner.nextInt();
		int result=level1ViewModel.getResult(row,column,adventureRow,adventureCol,goldRow,goldCol);
		System.out.println("---Minimum steps to Reach Gold----");
		System.out.println(result);
	}

}
