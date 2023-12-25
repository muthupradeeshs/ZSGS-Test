package dungeongame.level5;

import dungeongame.level4.Level4View;

public class Level5ViewModel {
	Level5View level5View;
	int[][] arr;
	int[][] panel;
	

	public Level5ViewModel(Level5View level5View) {
		this.level5View = level5View;
	}
	public int getResult(int row,int column,int adventureRow,int adventureCol,int goldRow,int goldCol)
	{
		for (int i = adventureRow - 1; i >= goldRow - 1; i--) {
			for (int j = adventureCol; j < column; j++) {
				if (set.contains(i + "," + j)) {
					arr[i][j] = 999;
					continue;
				}
				if (i == adventureRow - 1 && j == 0)
					continue;
				else if (j == 0)
					arr[i][j] = arr[i + 1][j] + 1;
				else if (i == adventureRow - 1)
					arr[i][j] = arr[i][j - 1] + 1;
				else
					arr[i][j] = Math.min(arr[i + 1][j], arr[i][j - 1]) + 1;
			}
		}
		if (arr[goldRow][goldCol] > 20)
			System.out.println("No possible solutions");
		else
			System.out.println("Minimum number of steps : " + arr[grow][gcol]);
	}
	public void getpits(int n) {
		for(int i=0;i<n;i++)
		{
			Scanner
		}
		
	}
	public void toCreateArray(int row, int column) {
		panel=new int[row][column];
		
	}
}
