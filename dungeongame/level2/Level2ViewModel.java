package dungeongame.level2;

import dungeongame.level1.Level1View;

public class Level2ViewModel {
	Level2View level2View;

	public Level2ViewModel(Level2View level2View) {
		this.level2View = level2View;
	}
	public int getResult(int row,int column,int adventureRow,int adventureCol,int monsterRow,int monsterCol,int goldRow,int goldCol)
	{
		int adventureStep=Math.abs(adventureRow-goldRow) + Math.abs(adventureCol-goldCol);
		int  monsterStep=Math.abs(monsterRow-goldRow) + Math.abs(monsterCol-goldCol);
		if(monsterStep>=adventureStep)
		{
			return adventureStep;
		}
		else
			return 0;
	}

}
