package rolehierarchy.Level1;

import rolehierarchy.RoleMain;
import rolehierarchy.dto.*;

public class Level1View {
	public Level1View()
	{
		Level1ViewModel level1ViewModel=new Level1ViewModel();
	}
	public void start()
	{
		System.out.println("Enter the Root Role Name : ");
		String name=RoleMain.scanner.nextLine();
		RoleMain.rootRole=new RoleManagement(name);
		System.out.println("Root of Hierarchy : "+RoleMain.rootRole.getName());
	}
}
