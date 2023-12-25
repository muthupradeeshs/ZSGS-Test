package dungeongame.level6;

import dungeongame.level6.Level6View;

public class Level6ViewModel {
	Level6View level6View;

	public Level6ViewModel(Level6View level6View) {
		this.level6View = level6View;
	}
	public int getResult(int row,int column,int adventureRow,int adventureCol,int monsterRow,int monsterCol,int triggerRow,int triggerCol,int goldRow,int goldCol)
	{
		int count;
		
		int monsterStep=Math.abs(adventureRow-goldRow) + Math.abs(adventureCol-goldCol);
		int  adventureStep=Math.abs(monsterRow-goldRow) + Math.abs(monsterCol-goldCol);
		int arr[][]=new int[adventureStep][2];
		

}
}
