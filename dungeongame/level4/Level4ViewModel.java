package dungeongame.level4;

public class Level4ViewModel {
	Level4View level4View;

	public Level4ViewModel(Level4View level4View) {
		this.level4View = level4View;
	}
	public int getResult(int row,int column,int adventureRow,int adventureCol,int monsterRow,int monsterCol,int triggerRow,int triggerCol,int goldRow,int goldCol)
	{  
		int adventureStep=Math.abs(adventureRow-goldRow) + Math.abs(adventureCol-goldCol);
		int  monsterStep=Math.abs(monsterRow-goldRow) + Math.abs(monsterCol-goldCol);
		int  triggerStep=Math.abs(triggerRow-goldRow) + Math.abs(triggerCol-goldCol);
		int trigger2=Math.abs(adventureRow-triggerRow) + Math.abs(adventureCol-triggerCol);
		if(monsterStep>=adventureStep)
		{
			return adventureStep;
		}
		else if(monsterStep<adventureStep && monsterStep<=triggerStep)
		{
			return trigger2+triggerStep;
		}
		else
			return 0;
			

}
}
