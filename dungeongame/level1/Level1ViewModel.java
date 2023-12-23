package dungeongame.level1;

public class Level1ViewModel {
	Level1View level1View;

	public Level1ViewModel(Level1View level1View) {
		this.level1View = level1View;
	}
	public int getResult(int row,int column,int adventureRow,int adventureCol,int goldRow,int goldCol)
	{
		int step=Math.abs(adventureRow-goldRow) + Math.abs(adventureCol-goldCol);
		return step;
	}

}
