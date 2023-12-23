package dungeongame.level3;

import dungeongame.level3.Level3View;

public class Level3ViewModel {
	Level3View level3View;

	public Level3ViewModel(Level3View level3View) {
		this.level3View = level3View;
	}
	public void getResult(int row,int column,int adventureRow,int adventureCol,int monsterRow,int monsterCol,int goldRow,int goldCol)
	{
		int count;
		
		int adventureStep=Math.abs(adventureRow-goldRow) + Math.abs(adventureCol-goldCol);
		int  monsterStep=Math.abs(monsterRow-goldRow) + Math.abs(monsterCol-goldCol);
		int left=0,right=0;
		if(monsterStep<=adventureStep)
		{

			System.out.println("minimum number of steps is  : " + adventureStep);
			System.out.println("path : ");
			for (int i = adventureRow; i >= goldRow; i--) {
				for (int j = adventureCol; j <= goldCol; j++) {
					System.out.print("(" + i + "," + j + ")");
					if (i != goldRow || j != goldCol)
						System.out.println("->");
				}
				adventureCol = goldCol;
			}
		}
		else
			System.out.println("NOt possible..!");
		

}
}
