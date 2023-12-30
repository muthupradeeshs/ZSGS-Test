package rolehierarchy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Repository {
	Map<Integer,ArrayList<String>> role=new HashMap<>();
	private static Repository repository;
	public Repository()
	{
		
	}
	public static Repository getInstance() {
		if (repository == null) {
			repository = new Repository();
			
		}
		return repository;
	}

}
