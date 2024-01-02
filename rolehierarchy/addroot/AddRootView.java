package rolehierarchy.addroot;

import rolehierarchy.RoleMain;
import rolehierarchy.dto.*;

public class AddRootView {
	public AddRootView()
	{
		AddRootViewModel level1ViewModel=new AddRootViewModel();
	}
	public void start()
	{
		System.out.println("Enter the Root Role Name : ");
		String name=RoleMain.scanner.nextLine();
		RoleMain.rootRole=new RoleManagement(name);
		System.out.println("Root of Hierarchy : "+RoleMain.rootRole.getName());
	}
}
