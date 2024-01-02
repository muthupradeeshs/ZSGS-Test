package rolehierarchy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import rolehierarchy.dto.RoleManagement;

public class Repository {
	static ArrayList<RoleManagement> arr=new ArrayList<>();
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
	public static void addrole(RoleManagement roleManagement)
	{
		arr.add(roleManagement);	
	}

}
